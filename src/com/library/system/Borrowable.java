package com.library.system;

public interface Borrowable {
      void borrowItem(String memberId);
      void returnItem();
      boolean  isAvailable();
}
