package com.example.mylibrary;

import android.os.Build;

import java.util.HashMap;

/**
 * Created by shinji on 2018/01/04.
 */

public class DeviceInfo {

	public static HashMap collect() {
		// 端末情報を入れる連想配列を定義
		HashMap map = new HashMap();

		// 連想配列に端末情報を追加していく
		map.put("carrier", Build.BRAND);
		map.put("device",Build.DEVICE);
		map.put("manufacture",Build.MANUFACTURER);
		map.put("model",Build.MODEL);
		map.put("version",Build.VERSION.RELEASE);

		// 呼び出し元に端末情報を返す
		return map;
	}
}
