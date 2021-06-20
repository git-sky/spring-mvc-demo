package cn.com.sky.advice;


import org.apache.commons.lang3.StringUtils;

public enum DesensitizeType {
    //身份证 18
    ID_CARD_18("ID_CARD_18", 2, 14, 2, 2) {
        @Override
        public String getShiftContent(String oldValue, Integer prefix, Integer middle, Integer suffix, Integer minLength) {
            if (oldValue != null && oldValue.length() >= minLength) {
                return oldValue.substring(0, prefix)
                        + StringUtils.repeat("*", middle)
                        + oldValue.substring(oldValue.length() - suffix);
            }
            return oldValue;
        }
    },
    //手机号
    MOBILE_PHONE("MOBILE_PHONE", 3, 4, 4, 4) {
        @Override
        public String getShiftContent(String oldValue, Integer prefix, Integer middle, Integer suffix, Integer minLength) {
            if (oldValue != null && oldValue.length() >= minLength) {
                return oldValue.substring(0, prefix)
                        + StringUtils.repeat("*", middle)
                        + oldValue.substring(oldValue.length() - suffix);
            }
            return oldValue;
        }
    },
    //姓名
    REAL_NAME("REAL_NAME", 1, 1, 1, 2) {
        @Override
        public String getShiftContent(String oldValue, Integer prefix, Integer middle, Integer suffix, Integer minLength) {
            if (oldValue != null && oldValue.length() >= minLength) {
                if (suffix + prefix == oldValue.length()) {
                    return oldValue.substring(0, prefix)
                            + StringUtils.repeat("*", middle);
                }
                return oldValue.substring(0, prefix)
                        + StringUtils.repeat("*", middle)
                        + oldValue.substring(oldValue.length() - suffix);
            }
            return oldValue;
        }
    };

    private String fieldName;
    private Integer prefix;
    private Integer middle;
    private Integer suffix;
    private Integer minLength;


    DesensitizeType(String fieldName, Integer prefix, Integer middle, Integer suffix, Integer minLength) {
        this.fieldName = fieldName;
        this.prefix = prefix;
        this.middle = middle;
        this.suffix = suffix;
        this.minLength = minLength;
    }


    public abstract String getShiftContent(String oldValue, Integer prefix, Integer middle, Integer suffix, Integer minLength);

    public String getContent(String oldValue) {
        return getShiftContent(oldValue, this.prefix, this.middle, this.suffix, this.minLength);
    }

    public static String replace(String oldValue, DesensitizeType type) {
        return type.getContent(oldValue);
    }

    public static void main(String[] args) {
        System.out.println(replace("1", REAL_NAME));
        System.out.println(replace("12", REAL_NAME));
        System.out.println(replace("123", REAL_NAME));
        System.out.println(replace("1234", REAL_NAME));

    }
}