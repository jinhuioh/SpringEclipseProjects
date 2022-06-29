package pack01;
import java.sql.Timestamp;

public class BoardVo {
   //데이터들을 전달할 때
   //데이터들을 넣어줄 가방(주소) 역할의 클래스가 필요
   //변수를 만들어서 값만 넣었다 뺐다만 함.
   //vo=value object 값들을 넣고 빼고 한다는의미
   //Data Transfer object(DAO)
   private int idx;
   private String name;
   private String content;
   private String title;
   private Timestamp rgstdate;
   
   
public int getIdx() {
   return idx;
}
public void setIdx(int idx) {
   this.idx = idx;
}
public String getName() {
   return name;
}
public void setName(String name) {
   this.name = name;
}
public String getContent() {
   return content;
}
public void setContent(String content) {
   this.content = content;
}
public String getTitle() {
   return title;
}
public void setTitle(String title) {
   this.title = title;
}
public Timestamp getRgstdate() {
   return rgstdate;
}
public void setRgstdate(Timestamp rgstdate) {
   this.rgstdate = rgstdate;
}
@Override
public String toString() {
   return "BoardVo [idx=" + idx + ", name=" + name + ", content=" + content + ", title=" + title + "]";
}
   
   
}