package webhook.acxelense.wootric.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import webhook.acxelense.wootric.service.ResponseService;
import webhook.acxelense.wootric.model.Response;

@RestController
@RequestMapping("/api")
public class ResponseController {

	@Autowired
	private ResponseService responseService;
	
	@RequestMapping(value= "/responses", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public void addResponse(@RequestParam("response[id]") int id, 
			@RequestParam("response[score]") int score,
			@RequestParam("response[text]") String text,
			@RequestParam("response[ip_address]") String ipAddress,
			@RequestParam("response[origin_url]") String originUrl,
			@RequestParam("response[end_user_id]") int endUserId,
			@RequestParam("response[survey_id]") int surveyId,
			@RequestParam("response[created_at]") String createdAt,
			@RequestParam("response[updated_at]") String updatedAt,
			@RequestParam("response[excluded_from_calculations]") boolean excludedFromCalculation,
			@RequestParam("event_name") String eventName,
			@RequestParam("timestamp") String timestamp	) {
		
		responseService.addResponse(new Response(id,
				score,
				text,
				ipAddress,
				originUrl,
				endUserId,
				surveyId,
				createdAt,
				updatedAt,
				excludedFromCalculation,
				eventName,
				timestamp));

	}
}
