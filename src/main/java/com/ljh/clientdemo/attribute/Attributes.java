package com.ljh.clientdemo.attribute;

import io.netty.util.AttributeKey;

public interface Attributes {

    AttributeKey<Long> USER_ID = AttributeKey.newInstance("userId");
}
