package net.minecraftforge.gradle.userdev.util;

import java.util.stream.Stream;

public class MixinConfig {

    public Quack quack;

    public static final class Quack {
        public String targetRoot;
        public String accessorPackage;
    }

    public Stream<String> getExtractionPackages() {
        if (quack == null) return Stream.empty();
        final Stream.Builder<String> builder = Stream.builder();
        if (quack.accessorPackage != null) builder.add(quack.accessorPackage);
        if (quack.targetRoot != null) builder.add(quack.targetRoot);
        return builder.build();
    }
}
