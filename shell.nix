{ pkgs ? import <nixpkgs> {} }: with pkgs;
mkShell {
  buildInputs = [
    jdk17
  ];
  shellHook = ''export JAVA_HOME="${pkgs.jdk17}"'';
}
