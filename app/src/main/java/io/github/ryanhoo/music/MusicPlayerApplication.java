package io.github.ryanhoo.music;

import android.app.Application;

import io.github.inflationx.calligraphy3.CalligraphyConfig;
import io.github.inflationx.calligraphy3.CalligraphyInterceptor;
import io.github.inflationx.viewpump.ViewPump;

/**
 * Created with Android Studio.
 * User: ryan.hoo.j@gmail.com
 * Date: 8/31/16
 * Time: 9:32 PM
 * Desc: MusicPlayerApplication
 */
public class MusicPlayerApplication extends Application {

    private static MusicPlayerApplication sInstance;

    @Override
    public void onCreate() {
        super.onCreate();

        sInstance = this;

        // Custom fonts
//        CalligraphyConfig.initDefault(
//                new CalligraphyConfig.Builder()
//                        .setDefaultFontPath("fonts/Roboto-Monospace-Regular.ttf")
//                        .setFontAttrId(R.attr.fontPath)
//                        .build()
//        );

        ViewPump.init(ViewPump.builder()
                .addInterceptor(new CalligraphyInterceptor(
                        new CalligraphyConfig.Builder()
                                .setDefaultFontPath("fonts/Roboto-Monospace-Regular.ttf")
                                .setFontAttrId(R.attr.fontPath)
                                .build()))
                .build());

    }

    public static MusicPlayerApplication getInstance() {
        return sInstance;
    }
}
