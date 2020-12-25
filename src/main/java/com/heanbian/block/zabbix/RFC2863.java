package com.heanbian.block.zabbix;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class RFC2863 {

	private static final Map<String, String> _ifAdminStatus;
	private static final Map<String, String> _ifOperStatus;
	private static final Map<String, String> _ianaIfType;

	static {
		Map<String, String> ifAdminStatus = new HashMap<>();
		ifAdminStatus.put("1", "up");
		ifAdminStatus.put("2", "down");
		ifAdminStatus.put("3", "testing");
		_ifAdminStatus = Collections.unmodifiableMap(ifAdminStatus);

		Map<String, String> ifOperStatus = new HashMap<>();
		ifOperStatus.put("1", "up");
		ifOperStatus.put("2", "down");
		ifOperStatus.put("3", "testing");
		ifOperStatus.put("4", "unknown");
		ifOperStatus.put("5", "dormant");
		ifOperStatus.put("6", "notPresent");
		ifOperStatus.put("7", "lowerLayerDown");
		_ifOperStatus = Collections.unmodifiableMap(ifOperStatus);

		Map<String, String> ianaiftype = new HashMap<>();
		ianaiftype.put("0", "virtual");
		ianaiftype.put("1", "other");
		ianaiftype.put("2", "regular1822");
		ianaiftype.put("3", "hdh1822");
		ianaiftype.put("4", "ddnX25");
		ianaiftype.put("5", "rfc877x25");
		ianaiftype.put("6", "ethernetCsmacd");
		ianaiftype.put("7", "iso88023Csmacd");
		ianaiftype.put("8", "iso88024TokenBus");
		ianaiftype.put("9", "iso88025TokenRing");
		ianaiftype.put("10", "iso88026Man");
		ianaiftype.put("11", "starLan");
		ianaiftype.put("12", "proteon10Mbit");
		ianaiftype.put("13", "proteon80Mbit");
		ianaiftype.put("14", "hyperchannel");
		ianaiftype.put("15", "fddi");
		ianaiftype.put("16", "lapb");
		ianaiftype.put("17", "sdlc");
		ianaiftype.put("18", "ds1");
		ianaiftype.put("19", "e1");
		ianaiftype.put("20", "basicISDN");
		ianaiftype.put("21", "primaryISDN");
		ianaiftype.put("22", "propPointToPointSerial");
		ianaiftype.put("23", "ppp");
		ianaiftype.put("24", "softwareLoopback");
		ianaiftype.put("25", "eon");
		ianaiftype.put("26", "ethernet3Mbit");
		ianaiftype.put("27", "nsip");
		ianaiftype.put("28", "slip");
		ianaiftype.put("29", "ultra");
		ianaiftype.put("30", "ds3");
		ianaiftype.put("31", "sip");
		ianaiftype.put("32", "frameRelay");
		ianaiftype.put("33", "rs232");
		ianaiftype.put("34", "para");
		ianaiftype.put("35", "arcnet");
		ianaiftype.put("36", "arcnetPlus");
		ianaiftype.put("37", "atm");
		ianaiftype.put("38", "miox25");
		ianaiftype.put("39", "sonet");
		ianaiftype.put("40", "x25ple");
		ianaiftype.put("41", "iso88022llc");
		ianaiftype.put("42", "localTalk");
		ianaiftype.put("43", "smdsDxi");
		ianaiftype.put("44", "frameRelayService");
		ianaiftype.put("45", "v35");
		ianaiftype.put("46", "hssi");
		ianaiftype.put("47", "hippi");
		ianaiftype.put("48", "modem");
		ianaiftype.put("49", "aal5");
		ianaiftype.put("50", "sonetPath");
		ianaiftype.put("51", "sonetVT");
		ianaiftype.put("52", "smdsIcip");
		ianaiftype.put("53", "propVirtual");
		ianaiftype.put("54", "propMultiplexor");
		ianaiftype.put("55", "ieee80212");
		ianaiftype.put("56", "fibreChannel");
		ianaiftype.put("57", "hippiInterface");
		ianaiftype.put("58", "frameRelayInterconnect");
		ianaiftype.put("59", "aflane8023");
		ianaiftype.put("60", "aflane8025");
		ianaiftype.put("61", "cctEmul");
		ianaiftype.put("62", "fastEther");
		ianaiftype.put("63", "isdn");
		ianaiftype.put("64", "v11");
		ianaiftype.put("65", "v36");
		ianaiftype.put("66", "g703at64k");
		ianaiftype.put("67", "g703at2mb");
		ianaiftype.put("68", "qllc");
		ianaiftype.put("69", "fastEtherFX");
		ianaiftype.put("70", "channel");
		ianaiftype.put("71", "ieee80211");
		ianaiftype.put("72", "ibm370parChan");
		ianaiftype.put("73", "escon");
		ianaiftype.put("74", "dlsw");
		ianaiftype.put("75", "isdns");
		ianaiftype.put("76", "isdnu");
		ianaiftype.put("77", "lapd");
		ianaiftype.put("78", "ipSwitch");
		ianaiftype.put("79", "rsrb");
		ianaiftype.put("80", "atmLogical");
		ianaiftype.put("81", "ds0");
		ianaiftype.put("82", "ds0Bundle");
		ianaiftype.put("83", "bsc");
		ianaiftype.put("84", "async");
		ianaiftype.put("85", "cnr");
		ianaiftype.put("86", "iso88025Dtr");
		ianaiftype.put("87", "eplrs");
		ianaiftype.put("88", "arap");
		ianaiftype.put("89", "propCnls");
		ianaiftype.put("90", "hostPad");
		ianaiftype.put("91", "termPad");
		ianaiftype.put("92", "frameRelayMPI");
		ianaiftype.put("93", "x213");
		ianaiftype.put("94", "adsl");
		ianaiftype.put("95", "radsl");
		ianaiftype.put("96", "sdsl");
		ianaiftype.put("97", "vdsl");
		ianaiftype.put("98", "iso88025CRFPInt");
		ianaiftype.put("99", "myrinet");
		ianaiftype.put("100", "voiceEM");
		ianaiftype.put("101", "voiceFXO");
		ianaiftype.put("102", "voiceFXS");
		ianaiftype.put("103", "voiceEncap");
		ianaiftype.put("104", "voiceOverIp");
		ianaiftype.put("105", "atmDxi");
		ianaiftype.put("106", "atmFuni");
		ianaiftype.put("107", "atmIma");
		ianaiftype.put("108", "pppMultilinkBundle");
		ianaiftype.put("109", "ipOverCdlc");
		ianaiftype.put("110", "ipOverClaw");
		ianaiftype.put("111", "stackToStack");
		ianaiftype.put("112", "virtualIpAddress");
		ianaiftype.put("113", "mpc");
		ianaiftype.put("114", "ipOverAtm");
		ianaiftype.put("115", "iso88025Fiber");
		ianaiftype.put("116", "tdlc");
		ianaiftype.put("117", "gigabitEthernet");
		ianaiftype.put("118", "hdlc");
		ianaiftype.put("119", "lapf");
		ianaiftype.put("120", "v37");
		ianaiftype.put("121", "x25mlp");
		ianaiftype.put("122", "x25huntGroup");
		ianaiftype.put("123", "transpHdlc");
		ianaiftype.put("124", "interleave");
		ianaiftype.put("125", "fast");
		ianaiftype.put("126", "ip");
		ianaiftype.put("127", "docsCableMaclayer");
		ianaiftype.put("128", "docsCableDownstream");
		ianaiftype.put("129", "docsCableUpstream");
		ianaiftype.put("130", "a12MppSwitch");
		ianaiftype.put("131", "tunnel");
		ianaiftype.put("132", "coffee");
		ianaiftype.put("133", "ces");
		ianaiftype.put("134", "atmSubInterface");
		ianaiftype.put("135", "l2vlan");
		ianaiftype.put("136", "l3ipvlan");
		ianaiftype.put("137", "l3ipxvlan");
		ianaiftype.put("138", "digitalPowerline");
		ianaiftype.put("139", "mediaMailOverIp");
		ianaiftype.put("140", "dtm");
		ianaiftype.put("141", "dcn");
		ianaiftype.put("142", "ipForward");
		ianaiftype.put("143", "msdsl");
		ianaiftype.put("144", "ieee1394");
		ianaiftype.put("145", "if-gsn");
		ianaiftype.put("146", "dvbRccMacLayer");
		ianaiftype.put("147", "dvbRccDownstream");
		ianaiftype.put("148", "dvbRccUpstream");
		ianaiftype.put("149", "atmVirtual");
		ianaiftype.put("150", "mplsTunnel");
		ianaiftype.put("151", "srp");
		ianaiftype.put("152", "voiceOverAtm");
		ianaiftype.put("153", "voiceOverFrameRelay");
		ianaiftype.put("154", "idsl");
		ianaiftype.put("155", "compositeLink");
		ianaiftype.put("156", "ss7SigLink");
		ianaiftype.put("157", "propWirelessP2P");
		ianaiftype.put("158", "frForward");
		ianaiftype.put("159", "rfc1483");
		ianaiftype.put("160", "usb");
		ianaiftype.put("161", "ieee8023adLag");
		ianaiftype.put("162", "bgppolicyaccounting");
		ianaiftype.put("163", "frf16MfrBundle");
		ianaiftype.put("164", "h323Gatekeeper");
		ianaiftype.put("165", "h323Proxy");
		ianaiftype.put("166", "mpls");
		ianaiftype.put("167", "mfSigLink");
		ianaiftype.put("168", "hdsl2");
		ianaiftype.put("169", "shdsl");
		ianaiftype.put("170", "ds1FDL");
		ianaiftype.put("171", "pos");
		ianaiftype.put("172", "dvbAsiIn");
		ianaiftype.put("173", "dvbAsiOut");
		ianaiftype.put("174", "plc");
		ianaiftype.put("175", "nfas");
		ianaiftype.put("176", "tr008");
		ianaiftype.put("177", "gr303RDT");
		ianaiftype.put("178", "gr303IDT");
		ianaiftype.put("179", "isup");
		ianaiftype.put("180", "propDocsWirelessMaclayer");
		ianaiftype.put("181", "propDocsWirelessDownstream");
		ianaiftype.put("182", "propDocsWirelessUpstream");
		ianaiftype.put("183", "hiperlan2");
		ianaiftype.put("184", "propBWAp2Mp");
		ianaiftype.put("185", "sonetOverheadChannel");
		ianaiftype.put("186", "digitalWrapperOverheadChannel");
		ianaiftype.put("187", "aal2");
		ianaiftype.put("188", "radioMAC");
		ianaiftype.put("189", "atmRadio");
		ianaiftype.put("190", "imt");
		ianaiftype.put("191", "mvl");
		ianaiftype.put("192", "reachDSL");
		ianaiftype.put("193", "frDlciEndPt");
		ianaiftype.put("194", "atmVciEndPt");
		ianaiftype.put("195", "opticalChannel");
		ianaiftype.put("196", "opticalTransport");
		ianaiftype.put("197", "propAtm");
		ianaiftype.put("198", "voiceOverCable");
		ianaiftype.put("199", "infiniband");
		ianaiftype.put("200", "teLink");
		ianaiftype.put("201", "q2931");
		ianaiftype.put("202", "virtualTg");
		ianaiftype.put("203", "sipTg");
		ianaiftype.put("204", "sipSig");
		ianaiftype.put("205", "docsCableUpstreamChannel");
		ianaiftype.put("206", "econet");
		ianaiftype.put("207", "pon155");
		ianaiftype.put("208", "pon622");
		ianaiftype.put("209", "bridge");
		ianaiftype.put("210", "linegroup");
		ianaiftype.put("211", "voiceEMFGD");
		ianaiftype.put("212", "voiceFGDEANA");
		ianaiftype.put("213", "voiceDID");
		ianaiftype.put("214", "mpegTransport");
		ianaiftype.put("215", "sixToFour");
		ianaiftype.put("216", "gtp");
		ianaiftype.put("217", "pdnEtherLoop1");
		ianaiftype.put("218", "pdnEtherLoop2");
		ianaiftype.put("219", "opticalChannelGroup");
		ianaiftype.put("220", "homepna");
		ianaiftype.put("221", "gfp");
		ianaiftype.put("222", "ciscoISLvlan");
		ianaiftype.put("223", "actelisMetaLOOP");
		ianaiftype.put("224", "fcipLink");
		ianaiftype.put("225", "rpr");
		ianaiftype.put("226", "qam");
		ianaiftype.put("227", "lmp");
		ianaiftype.put("228", "cblVectaStar");
		ianaiftype.put("229", "docsCableMCmtsDownstream");
		ianaiftype.put("230", "adsl2");
		ianaiftype.put("231", "macSecControlledIF");
		ianaiftype.put("232", "macSecUncontrolledIF");
		ianaiftype.put("233", "aviciOpticalEther");
		ianaiftype.put("234", "atmbond");
		ianaiftype.put("235", "voiceFGDOS");
		ianaiftype.put("236", "mocaVersion1");
		ianaiftype.put("237", "ieee80216WMAN");
		ianaiftype.put("238", "adsl2plus");
		ianaiftype.put("239", "dvbRcsMacLayer");
		ianaiftype.put("240", "dvbTdm");
		ianaiftype.put("241", "dvbRcsTdma");
		ianaiftype.put("242", "x86Laps");
		ianaiftype.put("243", "wwanPP");
		ianaiftype.put("244", "wwanPP2");
		ianaiftype.put("245", "voiceEBS");
		ianaiftype.put("246", "ifPwType");
		ianaiftype.put("247", "ilan");
		ianaiftype.put("248", "pip");
		ianaiftype.put("249", "aluELP");
		ianaiftype.put("250", "gpon");
		ianaiftype.put("251", "vdsl2");
		ianaiftype.put("252", "capwapDot11Profile");
		ianaiftype.put("253", "capwapDot11Bss");
		ianaiftype.put("254", "capwapWtpVirtualRadio");
		ianaiftype.put("255", "bits");
		ianaiftype.put("256", "docsCableUpstreamRfPort");
		ianaiftype.put("257", "cableDownstreamRfPort");
		ianaiftype.put("258", "vmwareVirtualNic");
		ianaiftype.put("259", "ieee802154");
		ianaiftype.put("260", "otnOdu");
		ianaiftype.put("261", "otnOtu");
		ianaiftype.put("262", "ifVfiType");
		ianaiftype.put("263", "g9981");
		ianaiftype.put("264", "g9982");
		ianaiftype.put("265", "g9983");
		ianaiftype.put("266", "aluEpon");
		ianaiftype.put("267", "aluEponOnu");
		ianaiftype.put("268", "aluEponPhysicalUni");
		ianaiftype.put("269", "aluEponLogicalLink");
		ianaiftype.put("270", "aluGponOnu");
		ianaiftype.put("271", "aluGponPhysicalUni");
		ianaiftype.put("272", "vmwareNicTeam");
		ianaiftype.put("277", "docsOfdmDownstream");
		ianaiftype.put("278", "docsOfdmaUpstream");
		ianaiftype.put("279", "gfast");
		ianaiftype.put("280", "sdci");
		ianaiftype.put("281", "xboxWireless");
		ianaiftype.put("282", "fastdsl");
		ianaiftype.put("283", "docsCableScte55d1FwdOob");
		ianaiftype.put("284", "docsCableScte55d1RetOob");
		ianaiftype.put("285", "docsCableScte55d2DsOob");
		ianaiftype.put("286", "docsCableScte55d2UsOob");
		ianaiftype.put("287", "docsCableNdf");
		ianaiftype.put("288", "docsCableNdr");
		ianaiftype.put("289", "ptm");
		ianaiftype.put("290", "ghn");
		ianaiftype.put("291", "otnOtsi");
		ianaiftype.put("292", "otnOtuc");
		ianaiftype.put("293", "otnOduc");
		ianaiftype.put("294", "otnOtsig");
		ianaiftype.put("295", "microwaveCarrierTermination");
		ianaiftype.put("296", "microwaveRadioLinkTerminal");
		ianaiftype.put("297", "ieee8021axDrni");
		ianaiftype.put("298", "ax25");
		ianaiftype.put("299", "ieee19061nanocom");
		ianaiftype.put("300", "cpri");
		_ianaIfType = Collections.unmodifiableMap(ianaiftype);
	}

	public static String ofIfAdminStatus(String value) {
		return _ifAdminStatus.get(value) != null ? _ifAdminStatus.get(value) : value;
	}

	public static String ofIfOperStatus(String value) {
		return _ifOperStatus.get(value) != null ? _ifOperStatus.get(value) : value;
	}

	public static String ofIanaIfType(String value) {
		return _ianaIfType.get(value) != null ? _ianaIfType.get(value) : value;
	}
}
