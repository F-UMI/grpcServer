package io.grpc.example;

import java.util.Map;

public class ShellScriptService {

  private final static String[] CALL_CMD = {"/bin/bash", "-c", "sh script/SC.sh"};
  private final static ShRunner shRunner = new ShRunner();
  public static void main(String[] args) {
    Map<Integer,String> map = shRunner.execCommand(CALL_CMD);
    System.out.println(map);
  }
}
