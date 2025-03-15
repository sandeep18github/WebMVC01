package com.ssk.Bookbindings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookStore {

   private Integer bookID;
   private String bookName;
  private   Double bookPrice;

}
