package com.flyingh.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class PhoneBroadcastReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		String number = getResultData();
		if (!"5556".equals(number)) {
			setResultData("17951" + number);
		} else {
			setResultData(null);
		}
	}

}
