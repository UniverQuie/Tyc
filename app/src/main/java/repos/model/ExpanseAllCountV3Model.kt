package repos.model

/**
 * Created by Univer Quie on 2019/1/12.
 * @author: Univer Quie
 * @email: 397826579@qq.com
 */

data class ExpanseAllCountV3Model(
        var `data`: ExpanseAllCountV3Data?
):BaseInfoModel()

data class ExpanseAllCountV3Data(
        var abnormalCount: String?,
        var announcementCount: String?,
        var baipinCount: Int?,
        var baseTotal: Int?,
        var bidCount: String?,
        var bondCount: String?,
        var branchCount: Int?,
        var businessRiskTotal: Int?,
        var certificateCount: Int?,
        var changeCount: Int?,
        var checkCount: String?,
        var clearingCount: String?,
        var companyDevelopmentTotal: Int?,
        var companyJingpin: String?,
        var companyPortray: String?,
        var companyProduct: String?,
        var companyRongzi: Int?,
        var companyTeammember: String?,
        var copyrightWorks: String?,
        var courtCount: String?,
        var cpoyRCount: String?,
        var cpoyRCountAll: Int?,
        var creditChinaTotal: String?,
        var dishonest: Int?,
        var equityCount: String?,
        var finalHolderCount: Int?,
        var finalInvestCount: Int?,
        var financialAnalysis: Int?,
        var goudiCount: String?,
        var goudiCountV2: Int?,
        var historyInfoTotal: Int?,
        var holderCount: String?,
        var icpCount: Int?,
        var illegalCount: String?,
        var importAndExportCount: String?,
        var intellectualProperty: String?,
        var intellectualPropertyTotal: Int?,
        var inverstCount: Int?,
        var jigouTzanli: String?,
        var judicialRiskTotal: Int?,
        var judicialSaleCount: String?,
        var judicialaAidCount: String?,
        var lawsuitCount: String?,
        var licenseAllCount: Int?,
        var licenseCount: String?,
        var licenseCreditchina: String?,
        var managementConditionTotal: Int?,
        var mortgageCount: String?,
        var ownTaxCount: String?,
        var ownTotalCount: Int?,
        var pastAnnouncementCount: String?,
        var pastCourtCount: String?,
        var pastDishonest: Int?,
        var pastEquityCount: String?,
        var pastHolderCount: String?,
        var pastICCount: Int?,
        var pastInverstCount: String?,
        var pastLawsuitCount: String?,
        var pastLicenseCredit: Int?,
        var pastLicenseCreditCN: String?,
        var pastLicenseCreditIC: String?,
        var pastMortgageCount: Int?,
        var pastPunishment: Int?,
        var pastPunishmentCreditCN: String?,
        var pastPunishmentIC: String?,
        var pastZhixing: String?,
        var patentCount: String?,
        var productinfo: String?,
        var proxyPeersStatus: Int?,
        var publicnotice: String?,
        var punishment: String?,
        var punishmentAll: Int?,
        var punishmentCreditchina: Int?,
        var recruitCount: String?,
        var reportCount: String?,
        var staffCount: String?,
        var staffCount_gj: String?,
        var taxCreditCount: String?,
        var teleCommunicationLicense: String?,
        var tmCount: String?,
        var weChatCount: String?,
        var zhixing: String?
)