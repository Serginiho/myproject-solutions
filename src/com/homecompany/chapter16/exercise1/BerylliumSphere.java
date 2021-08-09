package com.homecompany.chapter16.exercise1;

import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class BerylliumSphere implements Comparable<BerylliumSphere> {
  private static long count;
  private final long id = count++;
  private static Random random = new Random();
  private static int increment = 1;
  public long value = random.nextInt(100);

  @Override
  public String toString() {
   String result = "[Sphere: " + value + "]";
   if ((increment++) %3 == 0)
    result += "\n";
   return  result;
  }

 @Override
 public int compareTo(@NotNull BerylliumSphere o) {
  return (Long.compare(value, o.value));
 }
}
