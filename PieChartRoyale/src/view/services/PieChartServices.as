package view.services
{
	import classes.Constants;

	import org.apache.royale.net.HTTPService;
	import org.apache.royale.net.beads.CORSCredentialsBead;
	
	public class PieChartServices
	{
		public static const LISTING_AGENT:String = "/PieChartNsfRead?OpenAgent";
		public static const ADD_AGENT:String = "/PieChartNsfCreate?OpenAgent";
		public static const EDIT_AGENT:String = "/PieChartNsfDelete?OpenAgent";
		public static const REMOVE_AGENT:String = "/PieChartNsfUpdate?OpenAgent";
		
		public function PieChartServices()
		{
		}
		
		public function getPieChartData(resultCallback:Function, faultCallback:Function):void
		{
			var service:HTTPService = new HTTPService();
			service.addBead(new CORSCredentialsBead(true));
			service.url = Constants.AGENT_BASE_URL + LISTING_AGENT;
			service.method = "GET";
			service.addEventListener("complete", resultCallback);
			service.addEventListener("ioError", faultCallback);
			service.send();
		}
	}
}