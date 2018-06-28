package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;

/**
 * Accept / deny control of this MAV 
 */
@MavlinkMessageInfo(
        id = 6,
        crc = 104
)
public final class ChangeOperatorControlAck {
    private final int gcsSystemId;

    private final int controlRequest;

    private final int ack;

    private ChangeOperatorControlAck(int gcsSystemId, int controlRequest, int ack) {
        this.gcsSystemId = gcsSystemId;
        this.controlRequest = controlRequest;
        this.ack = ack;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * ID of the GCS this message 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 1
    )
    public final int gcsSystemId() {
        return this.gcsSystemId;
    }

    /**
     * 0: request control of this MAV, 1: Release control of this MAV 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 1
    )
    public final int controlRequest() {
        return this.controlRequest;
    }

    /**
     * 0: ACK, 1: NACK: Wrong passkey, 2: NACK: Unsupported passkey encryption method, 3: NACK: 
     * Already under control 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1
    )
    public final int ack() {
        return this.ack;
    }

    public static final class Builder {
        private int gcsSystemId;

        private int controlRequest;

        private int ack;

        /**
         * ID of the GCS this message 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 1
        )
        public final Builder gcsSystemId(int gcsSystemId) {
            this.gcsSystemId = gcsSystemId;
            return this;
        }

        /**
         * 0: request control of this MAV, 1: Release control of this MAV 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 1
        )
        public final Builder controlRequest(int controlRequest) {
            this.controlRequest = controlRequest;
            return this;
        }

        /**
         * 0: ACK, 1: NACK: Wrong passkey, 2: NACK: Unsupported passkey encryption method, 3: NACK: 
         * Already under control 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 1
        )
        public final Builder ack(int ack) {
            this.ack = ack;
            return this;
        }

        public final ChangeOperatorControlAck build() {
            return new ChangeOperatorControlAck(gcsSystemId, controlRequest, ack);
        }
    }
}