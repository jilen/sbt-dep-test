import cats.Monad
import cats.syntax.all._
import cats.effect._

object Foo extends IOApp {
  def run(args: List[String]) = {
    IO(ExitCode.Success)
  }
}
