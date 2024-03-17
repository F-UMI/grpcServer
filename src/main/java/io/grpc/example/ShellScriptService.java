package io.grpc.example;

import java.util.Map;

public class ShellScriptService {

  private final static String[] CALL_CMD = {"/bin/bash", "-c", "sh io/grpc/example/script/SC.sh"};

  public static void main(String[] args) {
    ShRunner shRunner = new ShRunner();
    Map<Integer,String> map = shRunner.execCommand(CALL_CMD);
    System.out.println(map);
  }
}
