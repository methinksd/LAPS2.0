package com.example.laps20

import android.util.Log

private class Intent  {
    /**
     * Sleep for some time and then start new activity.
     */
    @Override
    public void run() {
        try {
            //sleeping
            Thread.sleep(SLEEP_TIME*1000)
        } catch (Exception e) {
            Log.e(TAG, e.getMessage())
        }

        //Start main activty
        Intent intent = new Intent(SplashActivity.this, MainActivity.class)
        SplashActivity.this.startActivity(intent)
        SplashActivity.this.finish()
    }

}

@Override
protected void onPause() {
    super.onPause()
    overridePendingTransition(androidx.appcompat.R.anim.abc_fade_out)
}
}