package com.caijue.twet.common;

import com.caijue.twet.exception.MallException;
import com.caijue.twet.exception.MallExceptionEnum;
import com.google.common.collect.Sets;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Set;


@Component//标注Spring管理的Bean，使用@Component注解在一个类上，表示将此类标记为Spring容器中的一个Bean。
public class Constant {
    public static final String MALL_USER="mall_user";//用于放入session里对应的名字
    public static final String SALT="8asdfghjkl;'53";//自定义的常量（盐值用于加解密）
    public static String FILE_UPLOAD_DIR;//定义文件路径的常量

    @Value("${file.upload.dir}")//可以将配置文件内的对应的值赋值给下面方法里的参数
    public void setFileUploadDir(String fileUploadDir) {
        FILE_UPLOAD_DIR = fileUploadDir;//对文件路径进行赋值
    }
    //类里有个接口，叫做内部类（内部类可以直接访问外部类的所有东西，外部类想访问内部类要创建内部类对象）
    public interface ProductListOrderBy {
        //常量类里有这个值，但是又不想直接暴露出来，所以选择使用内部类
        Set<String> PRICE_ASC_DESC = Sets.newHashSet("price desc", "price asc");
    }

    public interface SaleStatus {
        int Ao_SALE = 0;//默认的审核状态（0待审核）
        int SALE = 1;//审核通过
        int NOT_SALE = 2;//审核未通过
    }

    public interface Cart {
        int UN_CHECKED = 0;//未接单
        int CHECKED = 1;//已接单
   }

    /**
     * 订单状态的枚举类
     */
    public enum OrderStatusEnum {
        CANCELED(0, "用户已取消"),
        NOT_PAID(10, "未付款"),
        PAID(20, "已付款"),
        DELIVERED(30, "已发货"),
        FINISHED(40, "交易完成");

        private String value;
        private int code;

        OrderStatusEnum(int code, String value) {
            this.value = value;
            this.code = code;
        }

        public static OrderStatusEnum codeOf(int code) {
            for (OrderStatusEnum orderStatusEnum : values()) {
                if (orderStatusEnum.getCode() == code) {
                    return orderStatusEnum;
                }
            }
            throw new MallException(MallExceptionEnum.NO_ENUM);
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }
    }

    public enum score {
        CANCELED(1.0, "E"),
        NOT_PAID(2.0, "D"),
        PAID(3.0, "C"),
        DELIVERED(4.0, "B"),
        FINISHED(5.0, "A");

        private String value;
        private Double code;

        score(Double code, String value) {
            this.value = value;
            this.code = code;
        }

        public static score codeOf(Double code) {
            for (score score : values()) {
                if (score.getCode() == code) {
                    return score;
                }
            }
            throw new MallException(MallExceptionEnum.NO_ENUM);
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Double getCode() {
            return code;
        }

        public void setCode(Double code) {
            this.code = code;
        }
    }

}
