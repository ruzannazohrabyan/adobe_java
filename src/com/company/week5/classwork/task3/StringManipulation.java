package com.company.week5.classwork.task3;

import java.util.Random;

public class StringManipulation {
    private static final Random RANDOM = new Random();
    private static final String[] STRINGS = {"a", "$", "1", "c", "%", "b", "f", "R", "-"};


    public static void main(String[] args) {

        try {
            System.out.println(generate(300000));
        } catch (OutOfDurationException e) {
            throw new RuntimeException("Generation doesn't work today",e);
            //e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static GenerationResult generate(int count) throws OutOfDurationException {
        if (count < 0) {
            throw new IllegalArgumentException("The count is negative");
        }
        final long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < count; i++) {
            if (System.currentTimeMillis() - start > 1000) {
                throw new OutOfDurationException("Count: " + count + " Generation duration is more than 1 second");
            }
            str += STRINGS[RANDOM.nextInt(STRINGS.length)];
        }
        return new GenerationResult(str, System.currentTimeMillis() - start);
    }

    private static class GenerationResult {
        private final String data;
        private final long duration;


        private GenerationResult(String data, long duration) {
            this.data = data;
            this.duration = duration;
        }

        public String getData() {
            return data;
        }

        public long getDuration() {
            return duration;
        }

        @Override
        public String toString() {
            return "GenerationResult{" +
                    "data='" + data + '\'' +
                    ", duration=" + duration +
                    '}';
        }
    }
}
