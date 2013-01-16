package miniboxing.benchmarks.launch

import scalameter.ScalameterBenchTest
import tests._

object BenchmarkingTest extends ScalameterBenchTest
                             with GenericBenchTest
                             with SpecializedBenchTest
                             with HardcodedMiniboxingBenchTest
                             with HardcodedMiniboxingClassLoadBenchTest
                             with HardcodedMiniboxingClassLoadFullBenchTest
                             with HardcodedMiniboxingDispatcherBenchTest
                             with IdealBenchTest
                             with Serializable{

  lazy val testSizes = {
    //List(1000, 2000, 3000)
    List(1000000, 2000000, 3000000)
    //List(1000000)
  }
  def lastTag = "list.find"
  def lastTraf = "generic"

  // run the tests:
  testIdeal()
  testHardcodedMiniboxingClassloaderFull()
  testHardcodedMiniboxingClassloaderPartial()
  testHardcodedMiniboxing(false)
  testHardcodedMiniboxing(true)
  testSpecialized()
  testGeneric()
  testHardcodedMiniboxingDispatch(false)
  testHardcodedMiniboxingDispatch(true)
}

