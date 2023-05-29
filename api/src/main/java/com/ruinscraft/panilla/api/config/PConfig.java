package com.ruinscraft.panilla.api.config;

import java.util.ArrayList;
import java.util.List;

public class PConfig {

	// defaults
	public boolean consoleLogging 			= true;
	public boolean chatLogging 				= false;
	public PStrictness strictness 			= PStrictness.AVERAGE;
	public List<String> nbtWhitelist 		= new ArrayList<>();

}