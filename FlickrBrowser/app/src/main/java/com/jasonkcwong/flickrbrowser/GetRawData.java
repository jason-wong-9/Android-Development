package com.jasonkcwong.flickrbrowser;

/**
 * Created by jason on 15-12-28.
 */
enum DownloadStatus { IDLE, PROCESSING, NOT_INITIALISED, FAILED_OREMPTY, OK }
public class GetRawData {
    private String LOG_TAG = GetRawData.class.getSimpleName();
    private String mRawUrl;
    private String mData;
    private DownloadStatus mDownloadStatus;

    public GetRawData(String mRawUrl) {
        this.mRawUrl = mRawUrl;
    }
}
