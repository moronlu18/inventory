package com.moronlu18.inventory.iu;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import com.moronlu18.inventory.R;

public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey);
    }
}