package me.fanjie.similaritycheck.core.entity;

/**
 * Created by fanji on 2016/11/13.
 */

public class CreateFaceSetResult {


    /**
     * added_face : 1
     * faceset_id : c1e580c0665f6ed11d510fe4d194b37a
     * faceset_name : NicolasCage
     * tag :
     */

    private int added_face;
    private String faceset_id;
    private String faceset_name;
    private String tag;

    public int getAdded_face() {
        return added_face;
    }

    public void setAdded_face(int added_face) {
        this.added_face = added_face;
    }

    public String getFaceset_id() {
        return faceset_id;
    }

    public void setFaceset_id(String faceset_id) {
        this.faceset_id = faceset_id;
    }

    public String getFaceset_name() {
        return faceset_name;
    }

    public void setFaceset_name(String faceset_name) {
        this.faceset_name = faceset_name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
