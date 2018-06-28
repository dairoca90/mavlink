package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;

/**
 * data for injecting into the onboard GPS (used for DGPS) 
 */
@MavlinkMessageInfo(
        id = 123,
        crc = 250
)
public final class GpsInjectData {
    private final int targetSystem;

    private final int targetComponent;

    private final int len;

    private final byte[] data;

    private GpsInjectData(int targetSystem, int targetComponent, int len, byte[] data) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.len = len;
        this.data = data;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * System ID 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 1
    )
    public final int targetSystem() {
        return this.targetSystem;
    }

    /**
     * Component ID 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 1
    )
    public final int targetComponent() {
        return this.targetComponent;
    }

    /**
     * data length 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1
    )
    public final int len() {
        return this.len;
    }

    /**
     * raw data (110 is enough for 12 satellites of RTCMv2) 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 1,
            arraySize = 110
    )
    public final byte[] data() {
        return this.data;
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private int len;

        private byte[] data;

        /**
         * System ID 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 1
        )
        public final Builder targetSystem(int targetSystem) {
            this.targetSystem = targetSystem;
            return this;
        }

        /**
         * Component ID 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 1
        )
        public final Builder targetComponent(int targetComponent) {
            this.targetComponent = targetComponent;
            return this;
        }

        /**
         * data length 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 1
        )
        public final Builder len(int len) {
            this.len = len;
            return this;
        }

        /**
         * raw data (110 is enough for 12 satellites of RTCMv2) 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 1,
                arraySize = 110
        )
        public final Builder data(byte[] data) {
            this.data = data;
            return this;
        }

        public final GpsInjectData build() {
            return new GpsInjectData(targetSystem, targetComponent, len, data);
        }
    }
}