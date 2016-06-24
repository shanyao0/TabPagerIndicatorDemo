#TabPagerIndicator
一个强大的顶部标题导航栏，支持6种不同的模式<br>

先来看下效果，再看使用方法
####一：MODE_WEIGHT_NOEXPAND_SAME<br>
几个标题均分宽度，不能扩展，底部导航线跟标题宽度一致<br>

![](https://raw.githubusercontent.com/shanyao0/TabPagerIndicatorDemo/master/gif/1.gif)  <br>

####二：MODE_WEIGHT_NOEXPAND_NOSAME<br>
几个标题均分宽度，不能扩展，底部导航线跟标题宽度不一致<br>

![](https://raw.githubusercontent.com/shanyao0/TabPagerIndicatorDemo/master/gif/2.gif)  <br>

####三：MODE_NOWEIGHT_NOEXPAND_SAME<br>
标题不均分宽度，不能扩展，底部导航线跟标题宽度一致<br>

![](https://raw.githubusercontent.com/shanyao0/TabPagerIndicatorDemo/master/gif/3.gif)  

####四：MODE_NOWEIGHT_NOEXPAND_NOSAME<br>
标题不均分宽度，不能扩展，底部导航线跟标题宽度不一致<br>

![](https://raw.githubusercontent.com/shanyao0/TabPagerIndicatorDemo/master/gif/4.gif)  <br>

####五：MODE_NOWEIGHT_EXPAND_SAME<br>
标题不均分宽度，能扩展，底部导航线跟标题宽度一致<br>

![](https://raw.githubusercontent.com/shanyao0/TabPagerIndicatorDemo/master/gif/5.gif)  <br>

####六：MODE_NOWEIGHT_EXPAND_NOSAME<br>
标题不均分宽度，能扩展，底部导航线跟标题宽度不一致<br>

![](https://raw.githubusercontent.com/shanyao0/TabPagerIndicatorDemo/master/gif/6.gif)  <br>

##使用方法
一般来说这个类是ViewPager+TabPagerIndicator+Fragment来使用的<br>

##### 1. 关联类库<br>
首先，下载我上面的TabPagerIndicatorDemo，然后将里面的tabpagerindicator类库import Module到你的项目，并关联
##### 2. xml布局
```Java
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#fff"
    android:orientation="vertical">

    <shanyao.tabpagerindictor.TabPageIndicator
        android:id="@+id/indicator"
        android:layout_width="match_parent"
        android:layout_height="40dp"
        />
    <android.support.v4.view.ViewPager
        android:id="@+id/viewPager"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#fff" />
</LinearLayout>
```
##### 3. 代码使用
```Java
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager_indicator);
        indicator = (TabPageIndicator)findViewById(R.id.indicator);
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        BasePagerAdapter adapter = new BasePagerAdapter(getSupportFragmentManager());
        
        viewPager.setAdapter(adapter);// 设置adapter
        indicator.setViewPager(viewPager);// 绑定indicator
        
        setTabPagerIndicator();
    }
    /**
      * 通过一些set方法，设置控件的属性
      */
    private void setTabPagerIndicator() {
        indicator.setIndicatorMode(TabPageIndicator.IndicatorMode.MODE_WEIGHT_NOEXPAND_SAME);// 设置模式，一定要先设置模式
        indicator.setDividerColor(Color.parseColor("#00bbcf"));// 设置分割线的颜色
        indicator.setDividerPadding(10);//设置
        indicator.setIndicatorColor(Color.parseColor("#43A44b"));// 设置底部导航线的颜色
        indicator.setTextColorSelected(Color.parseColor("#43A44b"));// 设置tab标题选中的颜色
        indicator.setTextColor(Color.parseColor("#797979"));// 设置tab标题未被选中的颜色
        indicator.setTextSize(16);// 设置字体大小
    }
```
###常用方法说明
```Java
setIndicatorMode()//设置控件的模式，上面是提到的6种模式
setDividerColor()//设置两个标题之间的竖直分割线的颜色，如果不需要显示这个，设置颜色为透明即可
setDividerPadding()//设置中间竖线上下的padding值
setIndicatorColor()//设置底部导航线的颜色，就是上面演示图的绿色导航线
setIndicatorHeight()// 设置底部导航线的高度
setDividerPadding()// 设置Tab标题之间的间距
setTextColorSelected()//设置tab标题选中的颜色
setTextColor()//设置tab标题未被选中的颜色
setTextSize()//设置字体的大小
setUnderlineColor()// 设置最下面一条的横线的颜色
setUnderlineHeight()//设置最下面一条的横线的高度
setScrollOffset()// 这个方法是当选择MODE_NOWEIGHT_EXPAND_NOSAME和MODE_NOWEIGHT_EXPAND_SAME这两个模式的时候有作用
具体作用大家，可以下载Demo自己试一试

```
######可能还有一些不是常用的方法，大家可以自己下载Demo去试试

###我的博客
[我的博客](http://blog.csdn.net/shan_yao)  
