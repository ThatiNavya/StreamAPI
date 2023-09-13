package com.collectors;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Encode_Decode {

	public static void main(String[] args) {
		String pwd = "vtalent@123";
		Encoder encoder = Base64.getEncoder();
		byte[] encode = encoder.encode(pwd.getBytes());

		String encodedpwd = new String(encode);
		System.out.println("Encoded pwd=  " + encodedpwd);
		System.out.println("***************************");

		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodedpwd);
		String decodedpwd = new String(decode);
		System.out.println("decoded pwd=  " + decodedpwd);

	}

}
