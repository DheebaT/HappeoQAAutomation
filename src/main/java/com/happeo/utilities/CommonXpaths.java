package com.happeo.utilities;

import java.util.HashMap;

public class CommonXpaths {
	HashMap<String, String> hsmp=new HashMap<String,String>();

	public String getmemappingValue(String mappervalue) {

		return hsmp.get(mappervalue);
	}

	public CommonXpaths() {

		HashMap<String, String> hsmp1=new HashMap<String,String>();
		System.out.println("inside getmemappingValue");

		//Login xpaths
		hsmp1.put("gSignInBtn", "//div[contains(text(),'Sign in with Google')]");
		hsmp1.put("GmailID", "//input[@id='identifierId']");
		hsmp1.put("Password", "//input[@name='password']");
		hsmp1.put("NextBtn", "//span[contains(text(),'Next')]");

		//New page creation xpaths
		hsmp1.put("ClickOnPagesMenu", "//body/navigation[1]/div[1]/div[1]/div[2]/div[1]/button[2]/p[1]");
		hsmp1.put("SearchInPages", "//input[@id='nav-pages-search']");
		hsmp1.put("SelectThisPageGrp", "//body/navigation[1]/div[1]/div[2]/div[3]/ul[1]/li[1]/div[1]/div[1]/a[1]/p[1]/mark[1]");
		hsmp1.put("clickEditMenuBtn", "body.primary-color__dark:nth-child(2) div.ng-scope:nth-child(2) page-view.ng-scope.ng-isolate-scope div.view-fill.custom-styles.page ul.page__actions.page__actions--dark li.ng-scope:nth-child(2) a.page-edit-btn.ng-isolate-scope unicon.ng-isolate-scope > svg:nth-child(1)");
		hsmp1.put("clickOnManagePagesBtn", "//span[contains(text(),'Manage pages')]");
		hsmp1.put("clickonAddSubPage", "//div[@class='drop-content']/ul/li[4]/a");
		hsmp1.put("clickOnDotted","//body/div[@id='ngView']/page[1]/pages-settings[1]/div[1]/manage-page[1]/form[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/manage-page-item[1]/div[1]/universe-dropdown[1]/a[1]/unicon[1]");
		hsmp1.put("EnterPageName","//input[@id='newPageModalInput']");
		hsmp1.put("ClickCreateBtn","//span[contains(text(),'Create')]");
		hsmp1.put("ElementPresentCheck", "//body/div[@id='ngView']/page-view[1]/div[1]/pages-hero[1]");

		// New post with Announcement date xpaths
		hsmp1.put("ChannelsBtn", "//p[contains(text(),'Channels')]");
		hsmp1.put("SearchBox","//input[@id='nav-channels-search']");
		hsmp1.put("SelectInterviewChannel","//mark[contains(text(),'Interview Channel')]");
		hsmp1.put("clickOnTextArea","body.primary-color__dark:nth-child(2) div.ng-scope:nth-child(2) channel.ng-scope.ng-isolate-scope div.view-fill.channel-view div.ng-scope channel-discussion.ng-scope.ng-isolate-scope div.channel-discussion div.channel-discussion__left.container-left__relative div.channel-discussion__feed.ng-scope channel-feed.ng-isolate-scope div.feed-wrapper new-post.grid-sizer.grid-sizer--nopadding.ng-scope.ng-isolate-scope div.ng-isolate-scope div.sc-jIyBzM.dLrVOl div.sc-fVHxE.jxXIbk.false.false div.sc-jvjHmY.cevRBd div.sc-gjAXCV.jhMZZs.reactFroalaEditor div.fr-box.universe-theme.fr-basic.fr-top:nth-child(1) div.fr-wrapper.show-placeholder div.fr-element.fr-view > p:nth-child(1)");
		hsmp1.put("clickOnPostOptnBtn","/html[1]/body[1]/div[1]/channel[1]/div[1]/div[3]/channel-discussion[1]/div[1]/div[1]/div[1]/channel-feed[1]/div[1]/new-post[1]/div[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[1]/button[1]");
		hsmp1.put("SelectShareAnnouncement","//p[contains(text(),'Share as an announcement')]");
		hsmp1.put("ClickShareBtn","//p[contains(text(),'Share')]");
		hsmp1.put("SureShareBtn","//p[contains(text(),'Share')]");
		hsmp1.put("ClickOnAnnouncementExpiryDropdwn","//div[contains(text(),'2 weeks')]");

		//Random Reaction to a post xpaths
		hsmp1.put("ClickonPostsBtn","//li[contains(text(),'Posts')]");
		hsmp1.put("CLickOnIconToView","body.primary-color__dark:nth-child(2) div.ng-scope:nth-child(2) channel.ng-scope.ng-isolate-scope div.view-fill.channel-view div.ng-scope channel-discussion.ng-scope.ng-isolate-scope div.channel-discussion div.channel-discussion__left.container-left__relative div.channel-discussion__feed.ng-scope channel-feed.ng-isolate-scope div.feed-wrapper post-feed.ng-isolate-scope div.ng-scope.ng-isolate-scope div.sc-jkPxnQ.dbYIZu div.sc-ewMkZo.bbCimv:nth-child(1) div.sc-wENpt.iUseaW:nth-child(1) div.sc-fIIFii.sc-frudsx.hmYQNe div.sc-hzOKmB.fOvGWq div.styles__Wrapper-sc-1lbrmb1-0.gXxRQg button.Buttons__ButtonBase-ohujtu-1.Buttons__ButtonPrimary-ohujtu-3.sc-gneEKw.jJqmQJ div.Buttons__Wrapper-ohujtu-2.fFPnbQ span:nth-child(1) div.Buttons__IconStyle-ohujtu-0.gCeDEY > svg:nth-child(1)");
		hsmp1.put("CLickViewOnPost","//p[contains(text(),'View post')]");
		hsmp1.put("clickOnLikeBtn","//p[contains(text(),'Like')]");

		//LogOut xpaths
		hsmp1.put("ClickIAtoSignOut","//body/navigation[1]/div[1]/div[1]/div[2]/div[3]/button[4]/div[1]/div[1]");
		hsmp1.put("ClickSignOut","//p[contains(text(),'Sign out')]");

		this.hsmp = hsmp1;
	}

}
