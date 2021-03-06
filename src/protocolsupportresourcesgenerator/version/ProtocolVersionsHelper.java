package protocolsupportresourcesgenerator.version;

import java.util.ArrayList;
import java.util.Arrays;

public class ProtocolVersionsHelper {

	public static final ProtocolVersion LATEST_PC = ProtocolVersion.getLatest(ProtocolType.PC);

	public static final ProtocolVersion LATEST_PE = ProtocolVersion.getLatest(ProtocolType.PE);

	public static final ProtocolVersion[] UP_1_6 = ProtocolVersion.getAllAfterI(ProtocolVersion.MINECRAFT_1_6_1);

	public static final ProtocolVersion[] UP_1_8 = ProtocolVersion.getAllAfterI(ProtocolVersion.MINECRAFT_1_8);

	public static final ProtocolVersion[] UP_1_9 = ProtocolVersion.getAllAfterI(ProtocolVersion.MINECRAFT_1_9);

	public static final ProtocolVersion[] UP_1_11 = ProtocolVersion.getAllAfterI(ProtocolVersion.MINECRAFT_1_11);

	public static final ProtocolVersion[] UP_1_12 = ProtocolVersion.getAllAfterI(ProtocolVersion.MINECRAFT_1_12);

	public static final ProtocolVersion[] UP_1_13 = ProtocolVersion.getAllAfterI(ProtocolVersion.MINECRAFT_1_13);

	public static final ProtocolVersion[] UP_1_14 = ProtocolVersion.getAllAfterI(ProtocolVersion.MINECRAFT_1_14);

	public static final ProtocolVersion[] BEFORE_1_5 = ProtocolVersion.getAllBeforeE(ProtocolVersion.MINECRAFT_1_5_1);

	public static final ProtocolVersion[] BEFORE_1_6 = ProtocolVersion.getAllBeforeE(ProtocolVersion.MINECRAFT_1_6_1);

	public static final ProtocolVersion[] BEFORE_1_7 = ProtocolVersion.getAllBeforeE(ProtocolVersion.MINECRAFT_1_7_5);

	public static final ProtocolVersion[] BEFORE_1_8 = ProtocolVersion.getAllBeforeE(ProtocolVersion.MINECRAFT_1_8);

	public static final ProtocolVersion[] BEFORE_1_9 = ProtocolVersion.getAllBeforeE(ProtocolVersion.MINECRAFT_1_9);

	public static final ProtocolVersion[] BEFORE_1_9_1 = ProtocolVersion.getAllBeforeE(ProtocolVersion.MINECRAFT_1_9_1);

	public static final ProtocolVersion[] BEFORE_1_10 = ProtocolVersion.getAllBeforeE(ProtocolVersion.MINECRAFT_1_10);

	public static final ProtocolVersion[] BEFORE_1_11 = ProtocolVersion.getAllBeforeE(ProtocolVersion.MINECRAFT_1_11);

	public static final ProtocolVersion[] BEFORE_1_11_1 = ProtocolVersion.getAllBeforeE(ProtocolVersion.MINECRAFT_1_11_1);

	public static final ProtocolVersion[] BEFORE_1_12 = ProtocolVersion.getAllBeforeE(ProtocolVersion.MINECRAFT_1_12);

	public static final ProtocolVersion[] BEFORE_1_13 = ProtocolVersion.getAllBeforeE(ProtocolVersion.MINECRAFT_1_13);

	public static final ProtocolVersion[] BEFORE_1_13_1 = ProtocolVersion.getAllBeforeE(ProtocolVersion.MINECRAFT_1_13_1);

	public static final ProtocolVersion[] BEFORE_1_14 = ProtocolVersion.getAllBeforeE(ProtocolVersion.MINECRAFT_1_14);

	public static final ProtocolVersion[] ALL_PC = ProtocolVersion.getAllBetween(ProtocolVersion.getOldest(ProtocolType.PC), LATEST_PC);

	public static final ProtocolVersion[] ALL_PE = ProtocolVersion.getAllBetween(ProtocolVersion.getOldest(ProtocolType.PE), LATEST_PE);

	public static final ProtocolVersion[] BEFORE_1_13_AND_PE = concat(BEFORE_1_13, ALL_PE);

	public static final ProtocolVersion[] concat(ProtocolVersion[] versions, ProtocolVersion... moreVersions) {
		ArrayList<ProtocolVersion> all = new ArrayList<>();
		all.addAll(Arrays.asList(versions));
		all.addAll(Arrays.asList(moreVersions));
		return all.toArray(new ProtocolVersion[all.size()]);
	}

}
