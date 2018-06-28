package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;

/**
 * Status generated by radio and injected into MAVLink stream. 
 */
@MavlinkMessageInfo(
        id = 109,
        crc = 185
)
public final class RadioStatus {
    private final int rssi;

    private final int remrssi;

    private final int txbuf;

    private final int noise;

    private final int remnoise;

    private final int rxerrors;

    private final int fixed;

    private RadioStatus(int rssi, int remrssi, int txbuf, int noise, int remnoise, int rxerrors,
            int fixed) {
        this.rssi = rssi;
        this.remrssi = remrssi;
        this.txbuf = txbuf;
        this.noise = noise;
        this.remnoise = remnoise;
        this.rxerrors = rxerrors;
        this.fixed = fixed;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Local signal strength 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 1
    )
    public final int rssi() {
        return this.rssi;
    }

    /**
     * Remote signal strength 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 1
    )
    public final int remrssi() {
        return this.remrssi;
    }

    /**
     * Remaining free buffer space in percent. 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1
    )
    public final int txbuf() {
        return this.txbuf;
    }

    /**
     * Background noise level 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 1
    )
    public final int noise() {
        return this.noise;
    }

    /**
     * Remote background noise level 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 1
    )
    public final int remnoise() {
        return this.remnoise;
    }

    /**
     * Receive errors 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 2
    )
    public final int rxerrors() {
        return this.rxerrors;
    }

    /**
     * Count of error corrected packets 
     */
    @MavlinkFieldInfo(
            position = 7,
            unitSize = 2
    )
    public final int fixed() {
        return this.fixed;
    }

    public static final class Builder {
        private int rssi;

        private int remrssi;

        private int txbuf;

        private int noise;

        private int remnoise;

        private int rxerrors;

        private int fixed;

        /**
         * Local signal strength 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 1
        )
        public final Builder rssi(int rssi) {
            this.rssi = rssi;
            return this;
        }

        /**
         * Remote signal strength 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 1
        )
        public final Builder remrssi(int remrssi) {
            this.remrssi = remrssi;
            return this;
        }

        /**
         * Remaining free buffer space in percent. 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 1
        )
        public final Builder txbuf(int txbuf) {
            this.txbuf = txbuf;
            return this;
        }

        /**
         * Background noise level 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 1
        )
        public final Builder noise(int noise) {
            this.noise = noise;
            return this;
        }

        /**
         * Remote background noise level 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 1
        )
        public final Builder remnoise(int remnoise) {
            this.remnoise = remnoise;
            return this;
        }

        /**
         * Receive errors 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 2
        )
        public final Builder rxerrors(int rxerrors) {
            this.rxerrors = rxerrors;
            return this;
        }

        /**
         * Count of error corrected packets 
         */
        @MavlinkFieldInfo(
                position = 7,
                unitSize = 2
        )
        public final Builder fixed(int fixed) {
            this.fixed = fixed;
            return this;
        }

        public final RadioStatus build() {
            return new RadioStatus(rssi, remrssi, txbuf, noise, remnoise, rxerrors, fixed);
        }
    }
}