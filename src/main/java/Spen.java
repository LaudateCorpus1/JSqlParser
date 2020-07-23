/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2019 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
//import net.sf.jsqlparser.JSQLParserException;
//import net.sf.jsqlparser.parser.CCJSqlParserUtil;
//import net.sf.jsqlparser.statement.Statements;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.HashMap;

public class Spen {
//
////  static String[] slugs = new String[]{
////      "mobile-app-new-user-funnel", "utm-dashboard", "marketing-campaign-performance-template", "product-feature-usage-custom-emoji", "2018_11_tutorial_logic", "bug-hunters-retention",
////      "2018-12_personalized_content_notice", "company-kpis-rwau", "premium-partners-drilldown", "company-kpis-rwg", "nux-funnel-homepage-registrations", "nitro_subscriptions", "chartio-dashboard-overview",
////      "company-kpis-revenue", "verified-servers", "product-feature-usage-soundshare", "sandbox-christina-zou-query-builder", "game-recommendation-survey-03042019", "sandbox-mack-straight-soundshare-failures-in-games",
////      "2018-11_mobile-presence", "product-feature-usage-ios-external-share", "game-network", "2019-01_activity_feed_rehaul-v2", "growth-accounting", "2018-2_premium-promo", "shiras-amzs", "2018-10_promotion_variants",
////      "activity-feed-ab-testing-template", "2019-04_activity_feed_server_discovery", "developer-metric-library", "nitro-lifecycle-drilldown", "bd-pipeline-overview-2018", "copy-of-explicit-image-experiment-1",
////      "growth-health-checks", "hook", "2018-10_marketing-landing-artwork", "channel-following", "2018-12_premium_trial", "nitro_subscriptions_updated_temp", "distribution", "2019-04_activity_feed_emoji_server_discovery",
////      "desktop-user-behavior-retention-engagement", "sandbox-chris-ramesh-promos-event-health", "2018-10_android_guild_add_hint", "growth-current-goals-growth-summary", "2018-10_new_slide_manager", "microcommunities",
////      "sandbox-chris-ramesh-self-serve-portal-queries", "public-servers", "invite-landing-ab-testing-template-android", "sandbox-arin-schwartz-partner-resurrection-sandbox", "sandbox-chris-ramesh-debug-launch-game-vs-app-opened",
////      "sandbox-jesse-dacumos-koth-cl", "cr-scratch", "overlay-1", "bots", "company-kpis-registrations", "premium-partners", "sandbox-jason-citron-feed-height-analysis", "company-kpis-rdau", "priority-speaker", "premium-partner-weekly-summary",
////      "december-2018-warframe-nitro-promo", "mobile-client-release-health-check", "mobile-tti", "2019-01_activity_feed_rehaul", "premium-partner-stats-by-server-guild-id", "self-serve-dashboard", "2019-05_nitro_boosting",
////      "ad-hoc-analysis-mobile-user-behavior", "store-tech-test", "hypesquad-online", "hypesquad-events", "changelog", "partner-server-member-behavior-lookup", "sandbox-sam-garfield-sg-sandbox-2019", "2018-08_android_inapp_notifs_v2",
////      "local-development-local-dev", "copy-of-explicit-image-experiment", "developer-portal", "gdpr", "2018-08-20-mobile-invite", "growth-current-goals-nux-funnel", "copy-of-2018-10_android_guild_add_hint", "copy-of-copy-of-explicit-image-experiment",
////      "store", "distribution-game-performance", "community-analytics", "user-acquisition", "sandbox-jason-citron-games-tab-5", "people-sam-simple-metric-explorer", "company-kpis-overview", "nitro-perk-drilldown", "recent-failed-events",
////      "registrations-drilldown", "2018-10_redesigned_add_guild-1", "game-recommendation-survey-342019-userid", "test-copy-of-user-friending-behavior", "trending-score-demos-v2", "hypesquad-event-attendees-coordinators", "country-overview",
////      "public-server-health-check", "sandbox-haru-darling-system-survey", "chartio-error-and-cleanup-check", "user-behavior-by-country", "marketing-website-stats", "2018-11-android-guild_add_edu", "lfg-all", "2019-04_mobile_nuf_join_server",
////      "job-funnel-lookup", "nitro-perks-overview", "rtc-quality-report-viewer", "2019-system-survey", "nitro-perk-reporting", "christine-sandbox-2019", "country-marketing-targeting-wip", "2018-09_android_unclaimed", "user-experiment-health",
////      "infrastructure-kpis", "product-group-dms-calls", "ad-hoc-analysis-2018-11_android_game_detection", "people-sergei-scratch", "desktop-user-behavior-activity-communication", "guilt-retention-overview", "board-deck-charts", "rdau-forecasts",
////      "recruiting-dashboard", "company-kpis-goals", "game-library", "2018-07_tabs-experiment", "sandbox-sam-garfield-sg-sandbox", "store-promotion-ab-testing-template", "discord-usage-by-client-version", "2018-3_homepage-nuf", "nitro_ab_testing_template",
////      "guild-experiment-health", "2018-11_android_game_detection", "xbox", "sandbox-christine-peng-ad-hoc-ts-deleted-users", "copy-of-hiring-dashboard", "sandbox-spencer-aiello-expliciit-image-experiment", "participation-events-health-check",
////      "rich-presence", "content-alert-system", "desktop-user-behavior-guild-size-preferences", "video-and-screenshare", "nitro-mobile-handoff", "sandbox-cameron-alston-india-call-analysis", "hubspot-error-checks", "spoiler-tags",
////      "guilds-overview", "sandbox-andrew-kim-hoges-sandbox", "2019-01_server-discovery", "mobile-kpis", "copy-of-copy-of-copy-of-explicit-image-experiment", "publishers-overview", "trending-game-demo", "spotify",
////      "sandbox-christina-zou-dm-funnels", "sandbox-christina-zou-gif-scratch", "sandbox-chris-ramesh-investigation-games-selling-through-graph", "gamechangers-marketing-utm-dashboard", "2019-02_new-user-landing-page-v2", "2018-10_android_invite_screen",
////      "promotions-simplified", "nitro-mobile", "2018-07_guild-video-v1-simplified", "sandbox-sam-garfield-duplicate-events-data", "core-users", "marketing-website-application-funnels", "ad-hoc-analysis-mobile-only-ever-users", "voice-overview",
////      "high-guild-join-velocity", "2019-03_professional_i18n", "product-user-behavior-user-server-usage-number-of-servers-used-all", "feature-self-serve", "experiment-android-in-app-notifications-30-2018-11",
////      "chartio-query-log", "email-ab-testing-template", "user-retention-overview", "gifts", "new-user-marketing-page-ab-testing-template", "2019-01_mobile_nuf_create_server", "2019-03_premium_home_recommended_applications",
////      "2018-11_application_library_premium", "trending-score-demos-48h", "user-settings", "people-sam-suspicious-users", "sandbox-template", "sandbox-sam-garfield-nitro-lifecycle-drilldown-wip", "existing-user-lfg-ab-test-deprecated", "2018-10_android_guild_welcome",
////      "copy-of-explicit-image-experiment-2", "ad-hoc-analysis-duplicate-account-sizing", "server-discovery-sizing", "north-star-metric-performance", "sergei-invite-landing-investigation", "2018-12_gif_picker", "sandbox-cameron-alston-trending-score-demos",
////      "product-user-behavior-user-behavior-by-games-played", "languages-overview", "company-kpis-guilds", "people-sam", "user-ab-testing-template", "product-feature-usage-reactions", "2019-02_guest_lurker_mode", "partners-program", "sandbox-christina-zou-verification-funnels",
////      "rtc-media-session-drilldown", "official-ios-nitro-data", "exp-inapp-notifs-v3", "overlay", "2018-12_android_unclaimed", "product-feature-usage-quickswitcher", "local-development-ios-dev-kpis", "christina-scratch-2", "sandbox-cameron-alston-game-recommendation-survey",
////      "client-experience-kpis", "sandbox-arin-schwartz-wip-go-live-kpis",
////      "trust-safety-kpis", "premium-partner-country-performance", "instrumentation-checker",
////      "2019-01_mobile_nuf_welcome_screen", "public-servers-1", "game-performance-comparison", "server-discovery", "marketing-gift-code-redemptions", "2019-05_premium_guilds", "games-overview", "game-recommendation-survey-2122019-uid", "overview-dashboards-user-information-lookup",
////      "growth-invite-funnel", "product-feature-usage-auth"
////  };
//
//  static String[] slugs = new String[]{
//      "verified-servers",
//"overview-dashboards-bd-marketing-kpis-overview",
//"publishers-overview",
//"games-overview",
//"guilds-overview",
//"bots",
//"country-overview",
//"languages-overview",
//"company-kpis-overview",
//"company-kpis-revenue",
//"company-kpis-registrations",
//"company-kpis-rwg",
//"company-kpis-goals",
//"company-kpis-rdau",
//"company-kpis-rwau",
//"company-kpis-guilds",
//"user-retention-overview",
//"board-deck-charts",
//"marketing-website-stats",
//"mobile-kpis",
//"nitro-lifecycle-drilldown",
//"nitro_subscriptions",
//"user-experiment-health",
//"guild-experiment-health"
//  };
//
//
//  static HashMap<String, String> parseQ() {
//    HashMap<String, String> strs = new HashMap<>();
//    ArrayList<File> fs = new ArrayList<>();
//    for(String slug: slugs) {
//      fs.add(new File("/home/spen/repos/chartio/dashboards/"+slug+"/gend"));
//    }
//    File[] fs = new File[]{
//        new File("/home/spen/repos/chartio/dashboards/company-kpis-goals/gend"),
//        new File("/home/spen/repos/chartio/dashboards/company-kpis-guilds/gend"),
//        new File("/home/spen/repos/chartio/dashboards/company-kpis-overview/gend"),
//        new File("/home/spen/repos/chartio/dashboards/company-kpis-rdau/gend"),
//        new File("/home/spen/repos/chartio/dashboards/company-kpis-registrations/gend"),
//        new File("/home/spen/repos/chartio/dashboards/company-kpis-revenue/gend"),
//        new File("/home/spen/repos/chartio/dashboards/company-kpis-rwau/gend"),
//        new File("/home/spen/repos/chartio/dashboards/company-kpis-rwg/gend"),
//        new File("/home/spen/repos/chartio/dashboards/nitro-perk-drilldown/gend"),
//        new File("/home/spen/repos/chartio/dashboards/nitro-mobile/gend"),
//        new File("/home/spen/repos/chartio/dashboards/nitro-perks-overview/gend"),
//    };
//    fs.add(new File("/home/spen/repos/chartio/dashboards/company-kpis-rwau/sdfg"));
//    for( File f: fs) {
////      if( f.listFiles()==null ) {
////        System.out.println("File " + f + " was empty");
////        continue;
////      }
//      for (File q : fs) {
//        //if( !q.getName().contains("4880433") ) continue;
//        if (q.getName().contains("~")) continue;
//        if( q.length() == 0 ) continue;
//        try (BufferedReader br = new BufferedReader(new FileReader(q))) {
//          StringBuilder sb = new StringBuilder();
//          String qline;
//
//          while ((qline = br.readLine()) != null) {
//            if( qline.toLowerCase().startsWith("set") ) // && qline.toLowerCase().contains("to"))
//              continue;
//            sb.append(qline);
//            sb.append("\n");
//          }
//          String[] ss = sb.toString().split(";");
//          if (ss[0].startsWith("SET"))
//            strs.put(q.getName(), ss[1]);
//          else
//            strs.put(q.getName(), sb.toString());
//        } catch (IOException ioe) {
//          throw new RuntimeException(ioe);
//        }
//      }
//    }
//    return strs;
//  }


  public static void main(String[] args) {
    System.out.println("hello world");

//    HashMap<String, String> queries = parseQ();
//
//    int i = 1;
//    for(String qn: queries.keySet()) {
//      try {
//        String query = queries.get(qn);
//        Statements stmt = CCJSqlParserUtil.parseStatements(query);
////        System.out.println(stmt);
//      } catch(Exception e) {
//        e.printStackTrace();
//        System.out.println("Failed on number " + qn);
//        System.out.println(queries.get(qn));
//        throw new RuntimeException(e);
//      }
//      i++;
//    }
//
//    System.out.println("All queries parse " + i + ".");
//
////    String q2 = "select * from foo where user_id in (1=1 AND NOT 1!=1)";
////    Statements stmt = CCJSqlParserUtil.parseStatements(q2);
////    System.out.println("asdf");
  }
}
