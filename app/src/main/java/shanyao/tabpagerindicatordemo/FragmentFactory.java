package shanyao.tabpagerindicatordemo;

import android.support.v4.app.Fragment;

import shanyao.tabpagerindicatordemo.fragment.AFragment;
import shanyao.tabpagerindicatordemo.fragment.BFragment;
import shanyao.tabpagerindicatordemo.fragment.CFragment;
import shanyao.tabpagerindicatordemo.fragment.DFragment;
import shanyao.tabpagerindicatordemo.fragment.EFragment;
import shanyao.tabpagerindicatordemo.fragment.FFragment;
import shanyao.tabpagerindicatordemo.fragment.GFragment;
import shanyao.tabpagerindicatordemo.fragment.HFragment;
import shanyao.tabpagerindicatordemo.fragment.IFragment;
import shanyao.tabpagerindicatordemo.fragment.JFragment;
import shanyao.tabpagerindicatordemo.fragment.KFragment;
import shanyao.tabpagerindicatordemo.fragment.LFragment;
import shanyao.tabpagerindicatordemo.fragment.MFragment;
import shanyao.tabpagerindicatordemo.fragment.NFragment;


/**
 * Created by shan_yao on 2016/6/17.
 */
public class FragmentFactory {
    public static Fragment createForNoExpand(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new AFragment();
                break;
            case 1:
                fragment = new BFragment();
                break;
            case 2:
                fragment = new CFragment();
                break;
        }
        return fragment;
    }

    public static Fragment createForExpand(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new DFragment();
                break;
            case 1:
                fragment = new EFragment();
                break;
            case 2:
                fragment = new FFragment();
                break;
            case 3:
                fragment = new GFragment();
                break;
            case 4:
                fragment = new HFragment();
                break;
            case 5:
                fragment = new IFragment();
                break;
            case 6:
                fragment = new JFragment();
                break;
            case 7:
                fragment = new KFragment();
                break;
            case 8:
                fragment = new LFragment();
                break;
            case 9:
                fragment = new MFragment();
                break;
            case 10:
                fragment = new NFragment();
                break;
        }
        return fragment;
    }
}
