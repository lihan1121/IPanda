package cn.co.com.newpanda.module.home;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import cn.co.com.newpanda.R;
import cn.co.com.newpanda.base.BaseFragment;
import cn.co.com.newpanda.model.entity.PandaLiveBean;


public class HomeFragment extends BaseFragment implements HomeContract.View {

    HomeContract.Presenter presenter;
    @BindView(R.id.mResultTv)
    TextView mResultTv;

    @Override
    protected int getLayoutId() {
        return R.layout.home_fragment;
    }

    @Override
    protected void init(View view) {

    }

    @Override
    protected void loadData() {

        presenter.start();

    }


    @Override
    public void showProgressDialog() {

    }

    @Override
    public void dismissDialog() {

    }

    @Override
    public void setResult(PandaLiveBean pandaLiveBean) {

        mResultTv.setText(pandaLiveBean.getLive().get(0).getTitle());
    }

    @Override
    public void showMessage(String msg) {
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setPresenter(HomeContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
