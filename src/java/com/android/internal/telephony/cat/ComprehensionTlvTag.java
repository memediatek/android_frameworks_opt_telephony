/*
 * Copyright (C) 2011 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.internal.telephony.cat;

import android.annotation.UnsupportedAppUsage;

/**
 * Enumeration for representing the tag value of COMPREHENSION-TLV objects. If
 * you want to get the actual value, call {@link #value() value} method.
 *
 * {@hide}
 */
public enum ComprehensionTlvTag {
    @UnsupportedAppUsage
    COMMAND_DETAILS(0x01),
    @UnsupportedAppUsage
    DEVICE_IDENTITIES(0x02),
    @UnsupportedAppUsage
    RESULT(0x03),
    DURATION(0x04),
    @UnsupportedAppUsage
    ALPHA_ID(0x05),
    @UnsupportedAppUsage
    ADDRESS(0x06),
    @UnsupportedAppUsage
    USSD_STRING(0x0a),
    @UnsupportedAppUsage
    SMS_TPDU(0x0b),
    @UnsupportedAppUsage
    TEXT_STRING(0x0d),
    TONE(0x0e),
    ITEM(0x0f),
    ITEM_ID(0x10),
    RESPONSE_LENGTH(0x11),
    FILE_LIST(0x12),
    HELP_REQUEST(0x15),
    DEFAULT_TEXT(0x17),
    EVENT_LIST(0x19),
    @UnsupportedAppUsage
    ICON_ID(0x1e),
    ITEM_ICON_ID_LIST(0x1f),
    IMMEDIATE_RESPONSE(0x2b),
    LANGUAGE(0x2d),
    URL(0x31),
    BROWSER_TERMINATION_CAUSE(0x34),
    @UnsupportedAppUsage
    TEXT_ATTRIBUTE(0x50),
    // MTK-START
    /* Refer to ETSI TS 101.220 section 7.2 */
    CAUSE(0x1a),
    TRANSACTION_ID(0x1c),
    BEARER_DESCRIPTION(0x35),
    CHANNEL_DATA(0x36),
    CHANNEL_DATA_LENGTH(0x37),
    CHANNEL_STATUS(0x38),
    BUFFER_SIZE(0x39),
    SIM_ME_INTERFACE_TRANSPORT_LEVEL(0x3C),
    OTHER_ADDRESS(0x3E),
    DNS_SERVER_ADDRESS(0x40),
    NETWORK_ACCESS_NAME(0x47),
    NEXT_ACTION_INDICATOR(0x18),
    DATE_TIME_AND_TIMEZONE(0x26),
    BATTERY_STATE(0x63),
    ACTIVATE_DESCRIPTOR(0x7B);
    // MTK-END

    private int mValue;

    ComprehensionTlvTag(int value) {
        mValue = value;
    }

    /**
     * Returns the actual value of this COMPREHENSION-TLV object.
     *
     * @return Actual tag value of this object
     */
    @UnsupportedAppUsage
    public int value() {
        return mValue;
    }

    public static ComprehensionTlvTag fromInt(int value) {
        for (ComprehensionTlvTag e : ComprehensionTlvTag.values()) {
            if (e.mValue == value) {
                return e;
            }
        }
        return null;
    }
}
