package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.MavlinkDialect;
import io.dronefleet.mavlink.MavlinkDialects;
import java.lang.Class;
import java.lang.IllegalArgumentException;
import java.lang.Override;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class ArdupilotmegaDialect implements MavlinkDialect {
    private static final Set<MavlinkDialect> dependencies;

    static {
        dependencies = Stream.of(
                MavlinkDialects.COMMON,
                MavlinkDialects.UAVIONIX,
                MavlinkDialects.ICAROUS)
                .collect(Collectors.toSet());
    }

    @Override
    public final boolean supports(int messageId) {
        switch (messageId) {
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 178:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 185:
            case 186:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
            case 200:
            case 201:
            case 214:
            case 215:
            case 216:
            case 217:
            case 218:
            case 219:
            case 226:
            case 11000:
            case 11001:
            case 11002:
            case 11003:
            case 11010:
            case 11011:
            case 11020:
            return true;
        }
        return dependencies.stream()
                .anyMatch(d -> d.supports(messageId));
    }

    @Override
    public final Class resolve(int messageId) {
        switch (messageId) {
            case 150: return SensorOffsets.class;
            case 151: return SetMagOffsets.class;
            case 152: return Meminfo.class;
            case 153: return ApAdc.class;
            case 154: return DigicamConfigure.class;
            case 155: return DigicamControl.class;
            case 156: return MountConfigure.class;
            case 157: return MountControl.class;
            case 158: return MountStatus.class;
            case 160: return FencePoint.class;
            case 161: return FenceFetchPoint.class;
            case 162: return FenceStatus.class;
            case 163: return Ahrs.class;
            case 164: return Simstate.class;
            case 165: return Hwstatus.class;
            case 166: return Radio.class;
            case 167: return LimitsStatus.class;
            case 168: return Wind.class;
            case 169: return Data16.class;
            case 170: return Data32.class;
            case 171: return Data64.class;
            case 172: return Data96.class;
            case 173: return Rangefinder.class;
            case 174: return AirspeedAutocal.class;
            case 175: return RallyPoint.class;
            case 176: return RallyFetchPoint.class;
            case 177: return CompassmotStatus.class;
            case 178: return Ahrs2.class;
            case 179: return CameraStatus.class;
            case 180: return CameraFeedback.class;
            case 181: return Battery2.class;
            case 182: return Ahrs3.class;
            case 183: return AutopilotVersionRequest.class;
            case 184: return RemoteLogDataBlock.class;
            case 185: return RemoteLogBlockStatus.class;
            case 186: return LedControl.class;
            case 191: return MagCalProgress.class;
            case 192: return MagCalReport.class;
            case 193: return EkfStatusReport.class;
            case 194: return PidTuning.class;
            case 195: return Deepstall.class;
            case 200: return GimbalReport.class;
            case 201: return GimbalControl.class;
            case 214: return GimbalTorqueCmdReport.class;
            case 215: return GoproHeartbeat.class;
            case 216: return GoproGetRequest.class;
            case 217: return GoproGetResponse.class;
            case 218: return GoproSetRequest.class;
            case 219: return GoproSetResponse.class;
            case 226: return Rpm.class;
            case 11000: return DeviceOpRead.class;
            case 11001: return DeviceOpReadReply.class;
            case 11002: return DeviceOpWrite.class;
            case 11003: return DeviceOpWriteReply.class;
            case 11010: return AdapTuning.class;
            case 11011: return VisionPositionDelta.class;
            case 11020: return AoaSsa.class;
        }
        return dependencies.stream()
                .filter(d -> d.supports(messageId))
                .map(d -> d.resolve(messageId))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Dialect ardupilotmega does not support a message of ID " + messageId));
    }
}
