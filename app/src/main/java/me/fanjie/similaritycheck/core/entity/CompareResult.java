package me.fanjie.similaritycheck.core.entity;

/**
 * Created by fanji on 2016/11/13.
 */

public class CompareResult {

    /**
     * component_similarity : {"eye":73.679835,"mouth":77.390801,"nose":80.22716,"eyebrow":74.043414}
     * session_id : 822e13ce5ae9896dbb18f0141d3fd254
     * similarity : 74.905818
     */

    private ComponentSimilarityBean component_similarity;
    private String session_id;
    private double similarity;

    public ComponentSimilarityBean getComponent_similarity() {
        return component_similarity;
    }

    public void setComponent_similarity(ComponentSimilarityBean component_similarity) {
        this.component_similarity = component_similarity;
    }

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    public double getSimilarity() {
        return similarity;
    }

    public void setSimilarity(double similarity) {
        this.similarity = similarity;
    }

    public static class ComponentSimilarityBean {
        /**
         * eye : 73.679835
         * mouth : 77.390801
         * nose : 80.22716
         * eyebrow : 74.043414
         */

        private double eye;
        private double mouth;
        private double nose;
        private double eyebrow;

        public double getEye() {
            return eye;
        }

        public void setEye(double eye) {
            this.eye = eye;
        }

        public double getMouth() {
            return mouth;
        }

        public void setMouth(double mouth) {
            this.mouth = mouth;
        }

        public double getNose() {
            return nose;
        }

        public void setNose(double nose) {
            this.nose = nose;
        }

        public double getEyebrow() {
            return eyebrow;
        }

        public void setEyebrow(double eyebrow) {
            this.eyebrow = eyebrow;
        }
    }
}
