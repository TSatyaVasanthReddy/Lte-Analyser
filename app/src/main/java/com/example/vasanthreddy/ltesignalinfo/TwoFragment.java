package com.example.vasanthreddy.ltesignalinfo;

/**
 * Created by vasanthreddy on 31/03/16.
 */
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vasanthreddy.ltesignalinfo.R;



public class TwoFragment extends Fragment{

    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        TelephonyManager tm=(TelephonyManager)getActivity().getSystemService(Context.TELEPHONY_SERVICE);
        //DEVICE DETAILS

        String IMEINumber=tm.getDeviceId();
        String subscriberID=tm.getDeviceId();
        String SIMSerialNumber=tm.getSimSerialNumber();
        String networkCountryISO=tm.getNetworkCountryIso();
        String SIMCountryISO=tm.getSimCountryIso();
        String softwareVersion=tm.getDeviceSoftwareVersion();
        String voiceMailNumber=tm.getVoiceMailNumber();
        View myInflatedView = inflater.inflate(R.layout.fragment_two, container, false);
        TextView tv=(TextView)myInflatedView.findViewById(R.id.txt2);
        String x="\nIMEI        :"+IMEINumber+"\nsubscriberID :"+subscriberID+"\nSIMNumber :"+SIMSerialNumber+"\nCountryISO  :"+SIMCountryISO+"\nNetworkISO :"+networkCountryISO+"\n";
        tv.setText(x);
        return myInflatedView;
    }

}