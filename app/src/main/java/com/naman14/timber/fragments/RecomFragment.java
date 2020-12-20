package com.naman14.timber.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.naman14.timber.adapters.SongsListAdapter;
import com.naman14.timber.listeners.MusicStateListener;
import com.naman14.timber.utils.PreferencesUtility;
import com.naman14.timber.widgets.BaseRecyclerView;

public class RecomFragment extends Fragment implements MusicStateListener {

    private SongsListAdapter mAdapter;
    private BaseRecyclerView recyclerView;
    private PreferencesUtility mPreferences;

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPreferences = PreferencesUtility.getInstance(getActivity());
    }

    @Override
    public void restartLoader() {

    }

    @Override
    public void onPlaylistChanged() {

    }

    @Override
    public void onMetaChanged() {

    }
}
