package com.andrey7mel.stepbystep.view.fragments;

import android.support.v4.app.Fragment;

import com.andrey7mel.stepbystep.presenter.Presenter;

public abstract class BaseFragment extends Fragment implements View {

    protected abstract Presenter getPresenter();

    @Override
    public void onStop() {
        super.onStop();
        if (getPresenter() != null) {
            getPresenter().onStop();
        }
    }

    @Override
    public void showLoadingState() {

    }

    @Override
    public void hideLoadingState() {

    }
}

