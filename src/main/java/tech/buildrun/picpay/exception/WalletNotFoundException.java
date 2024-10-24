package tech.buildrun.picpay.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

public class WalletNotFoundException extends PicPayException {
  private Long wallerId;

  public WalletNotFoundException(Long wallerId) {
    this.wallerId = wallerId;
  }

  @Override
  public ProblemDetail toProblemDetail(){
    var pb = ProblemDetail.forStatus(HttpStatus.UNPROCESSABLE_ENTITY);

    pb.setTitle("Wallet not found");
    pb.setDetail("There id no waller with id" + wallerId + ".");

    return pb;
  }
}
