package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.String;

/**
 * Send a key-value pair as integer. The use of this message is discouraged for normal packets, but 
 * a quite efficient way for testing new messages and getting experimental debug output. 
 */
@MavlinkMessageInfo(
        id = 252,
        crc = 44
)
public final class NamedValueInt {
    private final long timeBootMs;

    private final String name;

    private final int value;

    private NamedValueInt(long timeBootMs, String name, int value) {
        this.timeBootMs = timeBootMs;
        this.name = name;
        this.value = value;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Timestamp (milliseconds since system boot) 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 4
    )
    public final long timeBootMs() {
        return this.timeBootMs;
    }

    /**
     * Name of the debug variable 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 1,
            arraySize = 10
    )
    public final String name() {
        return this.name;
    }

    /**
     * Signed integer value 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 4,
            signed = true
    )
    public final int value() {
        return this.value;
    }

    public static final class Builder {
        private long timeBootMs;

        private String name;

        private int value;

        /**
         * Timestamp (milliseconds since system boot) 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 4
        )
        public final Builder timeBootMs(long timeBootMs) {
            this.timeBootMs = timeBootMs;
            return this;
        }

        /**
         * Name of the debug variable 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 1,
                arraySize = 10
        )
        public final Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Signed integer value 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 4,
                signed = true
        )
        public final Builder value(int value) {
            this.value = value;
            return this;
        }

        public final NamedValueInt build() {
            return new NamedValueInt(timeBootMs, name, value);
        }
    }
}