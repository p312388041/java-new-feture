package com.chong.js;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

public class Application  {
 
	public static void main(String[] args) { 
		try(Context context = Context.create())
		{
			Value value = context.eval("js", "2+2");
			System.out.println(value.asInt());
		}
	}
}
