package com.example.vasanthreddy.ltesignalinfo;

/**
 * Created by vasanthreddy on 31/03/16.
 */
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.telephony.TelephonyManager;

import java.util.ArrayList;
import java.util.List;

import com.example.vasanthreddy.ltesignalinfo.R;



public class OneFragment extends Fragment{

    private static final String TAG ="Messages:" ;

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        TelephonyManager  tm=(TelephonyManager)getActivity().getSystemService(Context.TELEPHONY_SERVICE);
        //DEVICE DETAILS

        String IMEINumber=tm.getDeviceId();
        String subscriberID=tm.getDeviceId();
        String SIMSerialNumber=tm.getSimSerialNumber();
        String networkCountryISO=tm.getNetworkCountryIso();
        String SIMCountryISO=tm.getSimCountryIso();
        String softwareVersion=tm.getDeviceSoftwareVersion();
        String voiceMailNumber=tm.getVoiceMailNumber();
        Log.e(TAG, "IMEI    :"+IMEINumber);
        Log.e(TAG, "SubscriberID    :"+subscriberID);
        Log.e(TAG, "SIMSerialNumber    :"+SIMSerialNumber);
        Log.e(TAG, "Network ISO     :"+networkCountryISO);
        Log.e(TAG, "SIM ISO    :"+SIMCountryISO);
        Log.e(TAG, "software Version   :"+softwareVersion);
        Log.e(TAG, "voiceMail Number    :"+voiceMailNumber);

        // Inflate the layout for this fragment
       // TextView t=(TextView)  getView().findViewById(R.id.txt1);
        return inflater.inflate(R.layout.fragment_one, container, false);
    }

}