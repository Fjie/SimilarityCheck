package me.fanjie.similaritycheck.facecheck;

import android.content.Intent;
import android.net.Uri;

import me.fanjie.similaritycheck.BasePersenter;
import me.fanjie.similaritycheck.BaseView;

/**
 * Created by fanji on 2016/11/7.
 */
public interface FaceContract {

    interface View extends BaseView<Presenter>{
        void selectImage(View view);
        void showImage(Uri uri);
        void showFaceFeature();
        void showReport();
    }

    interface Presenter extends BasePersenter{
        void result(int requestCode, int resultCode, Intent data);
        void check(Uri face1,Uri face2);
    }
}
