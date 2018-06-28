package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;

/**
 * The RAW values of the RC channels received. The standard PPM modulation is as follows: 1000 
 * microseconds: 0%, 2000 microseconds: 100%. Individual receivers/transmitters might 
 * violate this specification. 
 */
@MavlinkMessageInfo(
        id = 35,
        crc = 244
)
public final class RcChannelsRaw {
    private final long timeBootMs;

    private final int port;

    private final int chan1Raw;

    private final int chan2Raw;

    private final int chan3Raw;

    private final int chan4Raw;

    private final int chan5Raw;

    private final int chan6Raw;

    private final int chan7Raw;

    private final int chan8Raw;

    private final int rssi;

    private RcChannelsRaw(long timeBootMs, int port, int chan1Raw, int chan2Raw, int chan3Raw,
            int chan4Raw, int chan5Raw, int chan6Raw, int chan7Raw, int chan8Raw, int rssi) {
        this.timeBootMs = timeBootMs;
        this.port = port;
        this.chan1Raw = chan1Raw;
        this.chan2Raw = chan2Raw;
        this.chan3Raw = chan3Raw;
        this.chan4Raw = chan4Raw;
        this.chan5Raw = chan5Raw;
        this.chan6Raw = chan6Raw;
        this.chan7Raw = chan7Raw;
        this.chan8Raw = chan8Raw;
        this.rssi = rssi;
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
     * Servo output port (set of 8 outputs = 1 port). Most MAVs will just use one, but this allows for more 
     * than 8 servos. 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 1
    )
    public final int port() {
        return this.port;
    }

    /**
     * RC channel 1 value, in microseconds. A value of UINT16_MAX implies the channel is unused. 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 2
    )
    public final int chan1Raw() {
        return this.chan1Raw;
    }

    /**
     * RC channel 2 value, in microseconds. A value of UINT16_MAX implies the channel is unused. 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 2
    )
    public final int chan2Raw() {
        return this.chan2Raw;
    }

    /**
     * RC channel 3 value, in microseconds. A value of UINT16_MAX implies the channel is unused. 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 2
    )
    public final int chan3Raw() {
        return this.chan3Raw;
    }

    /**
     * RC channel 4 value, in microseconds. A value of UINT16_MAX implies the channel is unused. 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 2
    )
    public final int chan4Raw() {
        return this.chan4Raw;
    }

    /**
     * RC channel 5 value, in microseconds. A value of UINT16_MAX implies the channel is unused. 
     */
    @MavlinkFieldInfo(
            position = 7,
            unitSize = 2
    )
    public final int chan5Raw() {
        return this.chan5Raw;
    }

    /**
     * RC channel 6 value, in microseconds. A value of UINT16_MAX implies the channel is unused. 
     */
    @MavlinkFieldInfo(
            position = 8,
            unitSize = 2
    )
    public final int chan6Raw() {
        return this.chan6Raw;
    }

    /**
     * RC channel 7 value, in microseconds. A value of UINT16_MAX implies the channel is unused. 
     */
    @MavlinkFieldInfo(
            position = 9,
            unitSize = 2
    )
    public final int chan7Raw() {
        return this.chan7Raw;
    }

    /**
     * RC channel 8 value, in microseconds. A value of UINT16_MAX implies the channel is unused. 
     */
    @MavlinkFieldInfo(
            position = 10,
            unitSize = 2
    )
    public final int chan8Raw() {
        return this.chan8Raw;
    }

    /**
     * Receive signal strength indicator, 0: 0%, 100: 100%, 255: invalid/unknown. 
     */
    @MavlinkFieldInfo(
            position = 11,
            unitSize = 1
    )
    public final int rssi() {
        return this.rssi;
    }

    public static final class Builder {
        private long timeBootMs;

        private int port;

        private int chan1Raw;

        private int chan2Raw;

        private int chan3Raw;

        private int chan4Raw;

        private int chan5Raw;

        private int chan6Raw;

        private int chan7Raw;

        private int chan8Raw;

        private int rssi;

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
         * Servo output port (set of 8 outputs = 1 port). Most MAVs will just use one, but this allows for more 
         * than 8 servos. 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 1
        )
        public final Builder port(int port) {
            this.port = port;
            return this;
        }

        /**
         * RC channel 1 value, in microseconds. A value of UINT16_MAX implies the channel is unused. 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 2
        )
        public final Builder chan1Raw(int chan1Raw) {
            this.chan1Raw = chan1Raw;
            return this;
        }

        /**
         * RC channel 2 value, in microseconds. A value of UINT16_MAX implies the channel is unused. 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 2
        )
        public final Builder chan2Raw(int chan2Raw) {
            this.chan2Raw = chan2Raw;
            return this;
        }

        /**
         * RC channel 3 value, in microseconds. A value of UINT16_MAX implies the channel is unused. 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 2
        )
        public final Builder chan3Raw(int chan3Raw) {
            this.chan3Raw = chan3Raw;
            return this;
        }

        /**
         * RC channel 4 value, in microseconds. A value of UINT16_MAX implies the channel is unused. 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 2
        )
        public final Builder chan4Raw(int chan4Raw) {
            this.chan4Raw = chan4Raw;
            return this;
        }

        /**
         * RC channel 5 value, in microseconds. A value of UINT16_MAX implies the channel is unused. 
         */
        @MavlinkFieldInfo(
                position = 7,
                unitSize = 2
        )
        public final Builder chan5Raw(int chan5Raw) {
            this.chan5Raw = chan5Raw;
            return this;
        }

        /**
         * RC channel 6 value, in microseconds. A value of UINT16_MAX implies the channel is unused. 
         */
        @MavlinkFieldInfo(
                position = 8,
                unitSize = 2
        )
        public final Builder chan6Raw(int chan6Raw) {
            this.chan6Raw = chan6Raw;
            return this;
        }

        /**
         * RC channel 7 value, in microseconds. A value of UINT16_MAX implies the channel is unused. 
         */
        @MavlinkFieldInfo(
                position = 9,
                unitSize = 2
        )
        public final Builder chan7Raw(int chan7Raw) {
            this.chan7Raw = chan7Raw;
            return this;
        }

        /**
         * RC channel 8 value, in microseconds. A value of UINT16_MAX implies the channel is unused. 
         */
        @MavlinkFieldInfo(
                position = 10,
                unitSize = 2
        )
        public final Builder chan8Raw(int chan8Raw) {
            this.chan8Raw = chan8Raw;
            return this;
        }

        /**
         * Receive signal strength indicator, 0: 0%, 100: 100%, 255: invalid/unknown. 
         */
        @MavlinkFieldInfo(
                position = 11,
                unitSize = 1
        )
        public final Builder rssi(int rssi) {
            this.rssi = rssi;
            return this;
        }

        public final RcChannelsRaw build() {
            return new RcChannelsRaw(timeBootMs, port, chan1Raw, chan2Raw, chan3Raw, chan4Raw, chan5Raw, chan6Raw, chan7Raw, chan8Raw, rssi);
        }
    }
}