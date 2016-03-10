package org.stjs.bridge.modernizr;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.functions.Callback2;

@STJSBridge
public class Modernizr {
	public static Integer _version;

	public static Boolean applicationcache;

	public static Audio audio;

	public static class Audio {
		public static String m4a;
		public static String mp3;
		public static String ogg;
		public static String wav;
	}

	public static Input input;

	public static class Input {
		public static Boolean autocomplete;
		public static Boolean autofocus;
		public static Boolean list;
		public static Boolean max;
		public static Boolean min;
		public static Boolean multiple;
		public static Boolean pattern;
		public static Boolean placeholder;
		public static Boolean required;
		public static Boolean step;
	}

	public static InputTypes inputtypes;

	public static class InputTypes {
		public static Boolean color;
		public static Boolean date;
		public static Boolean datetime;
		//public static Boolean datetime-local;
		public static Boolean email;
		public static Boolean month;
		public static Boolean number;
		public static Boolean range;
		public static Boolean search;
		public static Boolean tel;
		public static Boolean time;
		public static Boolean url;
		public static Boolean week;
	}

	public static InputTypes video;

	public static class Video {
		public static String h264;
		public static String ogg;
		public static String webm;
	}

	public static Boolean borderradius;
	public static Boolean boxshadow;
	public static Boolean canvas;
	public static Boolean canvastext;
	public static Boolean cssanimations;
	public static Boolean cssgradients;
	public static Boolean cssreflections;
	public static Boolean csstransforms;
	public static Boolean csstransitions;
	public static Boolean draganddrop;
	public static Boolean macos;
	public static Boolean ipad;
	public static Boolean chromeipad;

	public static Boolean hasEvent(String str) {
		return null;
	}

	public static Boolean hasEvent(String str, Element elem) {
		return null;
	}

	public static Boolean hashchange;
	public static Boolean history;
	public static Boolean indexeddb;
	public static Boolean inlinesvg;

	public static Boolean localstorage;

	public static Boolean mq(String mediaQuery) {
		return null;
	}

	public static Boolean multiplebgs;
	public static Boolean opacity;
	public static Boolean postmessage;
	public static Boolean rgba;
	public static Boolean sessionstorage;
	public static Boolean svg;
	public static Boolean svgclippaths;

	/**
	 * Modernizr.testAllProps() investigates whether a given style property, or any of its vendor-prefixed variants, is recognized. Note that
	 * the
	 * property names must be provided in the camelCase variant.
	 */
	public static Boolean testAllProps(String property) {
		return null;
	}

	/**
	 * Modernizr.testProp() investigates whether a given style property is recognized. Note that the property names must be provided in the
	 * camelCase variant.
	 */
	public static Boolean testProp(String property) {
		return null;
	}

	/**
	 * Modernizr.testStyles() allows you to add custom styles to the document and test an element afterwards. An element with the id of
	 * "modernizr" is injected into the page. Modernizr.testStyles('#modernizr { width: 9px; color: papayawhip; }', function(elem, rule){
	 * Modernizr.addTest('width', elem.offsetWidth == 9); });
	 */
	public static Boolean testStyles(String str, Callback2<Element, String> fn) {
		return null;
	}

	/**
	 * If your test requires more than a single element to be injected you can specify the nodes argument which accepts a number indicating how
	 * many extra child div elements you want injected inside the main element. These extra elements will default to and id of "modernizr[n]"
	 * where n is a number. If you wish to specify a specific id the tesnames argument allows you to pass an array of id's to apply to the child
	 * elements. Modernizr.testStyles('#modernizr { width: 9px; color: papayawhip; }', function(elem, rule){ Modernizr.addTest('width',
	 * elem.offsetWidth == 9); }, 2, ["video", "image"]);
	 */
	public static Boolean testStyles(String str, Callback2<Element, String> fn, Integer nodes, Array<String> testnames) {
		return null;
	}

	public static Boolean textshadow;
	public static Boolean touch;

	public static Boolean websockets;
	public static Boolean websqldatabase;
	public static Boolean webworkers;
}
