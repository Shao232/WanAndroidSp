package net.sx.wpubliclibs.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * 所有activity都需要继承BaseActivity 为统一处理
 *
 * @author ss
 * created 2019/2/15 10:20
 */
public abstract class BaseActivity<T extends ViewDataBinding> extends AppCompatActivity {

    protected T mViewDataBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewDataBinding = DataBindingUtil.setContentView(this, getLayout());

        initData();
        initEvent();
    }

    /**
     * 添加activity布局
     * @return  返回activity布局
     */
    protected abstract int getLayout();

    /**
     * 子类activity在此方法进行初始化数据
     */
    protected abstract void initData();

    /**
     * 子类activity在此方法进行事件绑定
     */
    protected abstract void initEvent();

}
