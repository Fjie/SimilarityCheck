package me.fanjie.similaritycheck.core.entity;

import java.util.List;

/**
 * Created by fanji on 2016/11/13.
 */

public class DetectResult {


    /**
     * face : [{"attribute":{"age":{"range":5,"value":23},"gender":{"confidence":99.9999,"value":"Female"},"glass":{"confidence":99.945,"value":"None"},"pose":{"pitch_angle":{"value":17},"roll_angle":{"value":0.735735},"yaw_angle":{"value":-2}},"race":{"confidence":99.6121,"value":"Asian"},"smiling":{"value":4.86501}},"face_id":"17233b4b1b51ac91e391e5afe130eb78","position":{"center":{"x":49.4,"y":37.6},"eye_left":{"x":43.3692,"y":30.8192},"eye_right":{"x":56.5606,"y":30.9886},"height":26.8,"mouth_left":{"x":46.1326,"y":44.9468},"mouth_right":{"x":54.2592,"y":44.6282},"nose":{"x":49.9404,"y":38.8484},"width":26.8},"tag":""}]
     * img_height : 500
     * img_id : 22fd9efc64c87e00224c33dd8718eec7
     * img_width : 500
     * session_id : 38047ad0f0b34c7e8c6efb6ba39ed355
     * url : http://www.faceplusplus.com.cn/wp-content/themes/faceplusplus/assets/img/demo/1.jpg?v=4
     */

    private int img_height;
    private String img_id;
    private int img_width;
    private String session_id;
    private String url;
    private List<FaceBean> face;

    public int getImg_height() {
        return img_height;
    }

    public void setImg_height(int img_height) {
        this.img_height = img_height;
    }

    public String getImg_id() {
        return img_id;
    }

    public void setImg_id(String img_id) {
        this.img_id = img_id;
    }

    public int getImg_width() {
        return img_width;
    }

    public void setImg_width(int img_width) {
        this.img_width = img_width;
    }

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<FaceBean> getFace() {
        return face;
    }

    public void setFace(List<FaceBean> face) {
        this.face = face;
    }

    public static class FaceBean {
        /**
         * attribute : {"age":{"range":5,"value":23},"gender":{"confidence":99.9999,"value":"Female"},"glass":{"confidence":99.945,"value":"None"},"pose":{"pitch_angle":{"value":17},"roll_angle":{"value":0.735735},"yaw_angle":{"value":-2}},"race":{"confidence":99.6121,"value":"Asian"},"smiling":{"value":4.86501}}
         * face_id : 17233b4b1b51ac91e391e5afe130eb78
         * position : {"center":{"x":49.4,"y":37.6},"eye_left":{"x":43.3692,"y":30.8192},"eye_right":{"x":56.5606,"y":30.9886},"height":26.8,"mouth_left":{"x":46.1326,"y":44.9468},"mouth_right":{"x":54.2592,"y":44.6282},"nose":{"x":49.9404,"y":38.8484},"width":26.8}
         * tag :
         */

        private AttributeBean attribute;
        private String face_id;
        private PositionBean position;
        private String tag;

        public AttributeBean getAttribute() {
            return attribute;
        }

        public void setAttribute(AttributeBean attribute) {
            this.attribute = attribute;
        }

        public String getFace_id() {
            return face_id;
        }

        public void setFace_id(String face_id) {
            this.face_id = face_id;
        }

        public PositionBean getPosition() {
            return position;
        }

        public void setPosition(PositionBean position) {
            this.position = position;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public static class AttributeBean {
            /**
             * age : {"range":5,"value":23}
             * gender : {"confidence":99.9999,"value":"Female"}
             * glass : {"confidence":99.945,"value":"None"}
             * pose : {"pitch_angle":{"value":17},"roll_angle":{"value":0.735735},"yaw_angle":{"value":-2}}
             * race : {"confidence":99.6121,"value":"Asian"}
             * smiling : {"value":4.86501}
             */

            private AgeBean age;
            private GenderBean gender;
            private GlassBean glass;
            private PoseBean pose;
            private RaceBean race;
            private SmilingBean smiling;

            public AgeBean getAge() {
                return age;
            }

            public void setAge(AgeBean age) {
                this.age = age;
            }

            public GenderBean getGender() {
                return gender;
            }

            public void setGender(GenderBean gender) {
                this.gender = gender;
            }

            public GlassBean getGlass() {
                return glass;
            }

            public void setGlass(GlassBean glass) {
                this.glass = glass;
            }

            public PoseBean getPose() {
                return pose;
            }

            public void setPose(PoseBean pose) {
                this.pose = pose;
            }

            public RaceBean getRace() {
                return race;
            }

            public void setRace(RaceBean race) {
                this.race = race;
            }

            public SmilingBean getSmiling() {
                return smiling;
            }

            public void setSmiling(SmilingBean smiling) {
                this.smiling = smiling;
            }

            public static class AgeBean {
                /**
                 * range : 5
                 * value : 23
                 */

                private int range;
                private int value;

                public int getRange() {
                    return range;
                }

                public void setRange(int range) {
                    this.range = range;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class GenderBean {
                /**
                 * confidence : 99.9999
                 * value : Female
                 */

                private double confidence;
                private String value;

                public double getConfidence() {
                    return confidence;
                }

                public void setConfidence(double confidence) {
                    this.confidence = confidence;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            public static class GlassBean {
                /**
                 * confidence : 99.945
                 * value : None
                 */

                private double confidence;
                private String value;

                public double getConfidence() {
                    return confidence;
                }

                public void setConfidence(double confidence) {
                    this.confidence = confidence;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            public static class PoseBean {
                /**
                 * pitch_angle : {"value":17}
                 * roll_angle : {"value":0.735735}
                 * yaw_angle : {"value":-2}
                 */

                private PitchAngleBean pitch_angle;
                private RollAngleBean roll_angle;
                private YawAngleBean yaw_angle;

                public PitchAngleBean getPitch_angle() {
                    return pitch_angle;
                }

                public void setPitch_angle(PitchAngleBean pitch_angle) {
                    this.pitch_angle = pitch_angle;
                }

                public RollAngleBean getRoll_angle() {
                    return roll_angle;
                }

                public void setRoll_angle(RollAngleBean roll_angle) {
                    this.roll_angle = roll_angle;
                }

                public YawAngleBean getYaw_angle() {
                    return yaw_angle;
                }

                public void setYaw_angle(YawAngleBean yaw_angle) {
                    this.yaw_angle = yaw_angle;
                }

                public static class PitchAngleBean {
                    /**
                     * value : 17
                     */

                    private int value;

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }

                public static class RollAngleBean {
                    /**
                     * value : 0.735735
                     */

                    private double value;

                    public double getValue() {
                        return value;
                    }

                    public void setValue(double value) {
                        this.value = value;
                    }
                }

                public static class YawAngleBean {
                    /**
                     * value : -2
                     */

                    private int value;

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }
            }

            public static class RaceBean {
                /**
                 * confidence : 99.6121
                 * value : Asian
                 */

                private double confidence;
                private String value;

                public double getConfidence() {
                    return confidence;
                }

                public void setConfidence(double confidence) {
                    this.confidence = confidence;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            public static class SmilingBean {
                /**
                 * value : 4.86501
                 */

                private double value;

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }
            }
        }

        public static class PositionBean {
            /**
             * center : {"x":49.4,"y":37.6}
             * eye_left : {"x":43.3692,"y":30.8192}
             * eye_right : {"x":56.5606,"y":30.9886}
             * height : 26.8
             * mouth_left : {"x":46.1326,"y":44.9468}
             * mouth_right : {"x":54.2592,"y":44.6282}
             * nose : {"x":49.9404,"y":38.8484}
             * width : 26.8
             */

            private CenterBean center;
            private EyeLeftBean eye_left;
            private EyeRightBean eye_right;
            private double height;
            private MouthLeftBean mouth_left;
            private MouthRightBean mouth_right;
            private NoseBean nose;
            private double width;

            public CenterBean getCenter() {
                return center;
            }

            public void setCenter(CenterBean center) {
                this.center = center;
            }

            public EyeLeftBean getEye_left() {
                return eye_left;
            }

            public void setEye_left(EyeLeftBean eye_left) {
                this.eye_left = eye_left;
            }

            public EyeRightBean getEye_right() {
                return eye_right;
            }

            public void setEye_right(EyeRightBean eye_right) {
                this.eye_right = eye_right;
            }

            public double getHeight() {
                return height;
            }

            public void setHeight(double height) {
                this.height = height;
            }

            public MouthLeftBean getMouth_left() {
                return mouth_left;
            }

            public void setMouth_left(MouthLeftBean mouth_left) {
                this.mouth_left = mouth_left;
            }

            public MouthRightBean getMouth_right() {
                return mouth_right;
            }

            public void setMouth_right(MouthRightBean mouth_right) {
                this.mouth_right = mouth_right;
            }

            public NoseBean getNose() {
                return nose;
            }

            public void setNose(NoseBean nose) {
                this.nose = nose;
            }

            public double getWidth() {
                return width;
            }

            public void setWidth(double width) {
                this.width = width;
            }

            public static class CenterBean {
                /**
                 * x : 49.4
                 * y : 37.6
                 */

                private double x;
                private double y;

                public double getX() {
                    return x;
                }

                public void setX(double x) {
                    this.x = x;
                }

                public double getY() {
                    return y;
                }

                public void setY(double y) {
                    this.y = y;
                }
            }

            public static class EyeLeftBean {
                /**
                 * x : 43.3692
                 * y : 30.8192
                 */

                private double x;
                private double y;

                public double getX() {
                    return x;
                }

                public void setX(double x) {
                    this.x = x;
                }

                public double getY() {
                    return y;
                }

                public void setY(double y) {
                    this.y = y;
                }
            }

            public static class EyeRightBean {
                /**
                 * x : 56.5606
                 * y : 30.9886
                 */

                private double x;
                private double y;

                public double getX() {
                    return x;
                }

                public void setX(double x) {
                    this.x = x;
                }

                public double getY() {
                    return y;
                }

                public void setY(double y) {
                    this.y = y;
                }
            }

            public static class MouthLeftBean {
                /**
                 * x : 46.1326
                 * y : 44.9468
                 */

                private double x;
                private double y;

                public double getX() {
                    return x;
                }

                public void setX(double x) {
                    this.x = x;
                }

                public double getY() {
                    return y;
                }

                public void setY(double y) {
                    this.y = y;
                }
            }

            public static class MouthRightBean {
                /**
                 * x : 54.2592
                 * y : 44.6282
                 */

                private double x;
                private double y;

                public double getX() {
                    return x;
                }

                public void setX(double x) {
                    this.x = x;
                }

                public double getY() {
                    return y;
                }

                public void setY(double y) {
                    this.y = y;
                }
            }

            public static class NoseBean {
                /**
                 * x : 49.9404
                 * y : 38.8484
                 */

                private double x;
                private double y;

                public double getX() {
                    return x;
                }

                public void setX(double x) {
                    this.x = x;
                }

                public double getY() {
                    return y;
                }

                public void setY(double y) {
                    this.y = y;
                }
            }
        }
    }
}
