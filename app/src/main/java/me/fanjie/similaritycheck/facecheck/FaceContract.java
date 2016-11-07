package me.fanjie.similaritycheck.facecheck;

import me.fanjie.similaritycheck.BasePersenter;
import me.fanjie.similaritycheck.BaseView;

/**
 * Created by fanji on 2016/11/7.
 */
public interface FaceContract {

    interface View extends BaseView<Presenter>{

    }

    interface Presenter extends BasePersenter{

    }
}
