/**
 * Created by Michael on 11/12/15.
 */
import org.apache.spark.rdd.RDD

//remove if not needed

trait userSplit[T,K] {

  def usrSplit(inputList: RDD[(T,K)], splitTimes: Int): Array[RDD[(T,K)]]
}
