package shanyao.tabpagerindicatordemo.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import shanyao.tabpagerindicatordemo.R;
import shanyao.tabpagerindicatordemo.ShanYaoApplication;
import shanyao.tabpagerindicatordemo.FragmentFactory;
import shanyao.tabpagerindicatordemo.utils.CommonUtils;
import shanyao.tabpagerindictor.TabPageIndicator;

/**
 * Created by HuaChing904 on 2016/6/23.
 */
public class NoWeightNoExpandNoSame extends FragmentActivity {

    private TabPageIndicator indicator;
    private ViewPager viewPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager_indicator);
        indicator = (TabPageIndicator) findViewById(R.id.indicator);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        BasePagerAdapter adapter = new BasePagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        indicator.setViewPager(viewPager);
        setTabPagerIndicator();
    }

    private void setTabPagerIndicator() {
        indicator.setIndicatorMode(TabPageIndicator.IndicatorMode.MODE_NOWEIGHT_NOEXPAND_NOSAME);// 设置模式，一定要先设置模式
        indicator.setDividerColor(Color.parseColor("#00bbcf"));// 设置分割线的颜色
        indicator.setDividerPadding(CommonUtils.dip2px(ShanYaoApplication.getContext(), 10));
        indicator.setIndicatorColor(Color.parseColor("#43A44b"));// 设置底部导航线的颜色
        indicator.setTextColorSelected(Color.parseColor("#43A44b"));// 设置tab标题选中的颜色
        indicator.setTextColor(Color.parseColor("#797979"));// 设置tab标题未被选中的颜色
        indicator.setTextSize(CommonUtils.sp2px(ShanYaoApplication.getContext(), 16));// 设置字体大小
    }

    class BasePagerAdapter extends FragmentStatePagerAdapter {
        String[] titles;

        public BasePagerAdapter(FragmentManager fm) {
            super(fm);
            this.titles = CommonUtils.getStringArray(R.array.no_expand_titles);
        }

        @Override
        public Fragment getItem(int position) {
            return FragmentFactory.createForNoExpand(position);
        }

        @Override
        public int getCount() {
            return titles.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }
    }

}
