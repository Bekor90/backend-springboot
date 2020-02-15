package com.login.auth;

public class JwtConfig {
	
	public static final String LLAVE_SECRETA = "123";
	
	public static final String RSA_PRIVATE = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEowIBAAKCAQEAqqze15NW9PDv58OHLQJes3PM7WoJb48uz+OSMAr1AwSOuDWD\r\n" + 
			"fRh59vvjD+xE/Ya4AoLSUnlOxF+5z0VCtP1eW2gtFOxYHTC6mCOj8NPNiSEWz8wS\r\n" + 
			"/wGFUN64iEGfQjy0Fw7+90DC6kaxj1K9UMYdVmf8TuNV8BLIPV1h/QpUU1rDp+b4\r\n" + 
			"wccNjTnXxjWfVIzq5Gfm/eo4NM0LA9sCf5z25/hwH1fCUDRU7LpXYeEfzWCICb0l\r\n" + 
			"lJb10cyPb+ur/SJMxfeFlq2NP7zWeehTlJ90+TDf5gyaWdE/mXwXEjaYcZRVow7B\r\n" + 
			"Xax1f4SuevSNmDr5DUu6L9C13YhNhngBSvRqVwIDAQABAoIBAGc6Q1WzgcaH6zIM\r\n" + 
			"KrfoVQrIoUt+9NIKkc+e3o48MlBu8zsq8qo4oZvmYUECL//++VBbe4XyZNeU5jcc\r\n" + 
			"tunszKMQcSPUhr6w+EqIU+GW2Rt1beyki2C8tLti2c1fk0lmma3QnhlBjCJSO5Zp\r\n" + 
			"/qLaEGhwYEP+b73SPlYPIvL+yl3W7N9t5kCfgDt9I9nBYk9c401BA982iohGN1BR\r\n" + 
			"sljry9XtIhbmDpVwuVL3F4ttNLsmIOmrdVGiY5eWt9HMJEszrIKfHOQyj4DG+ysu\r\n" + 
			"t/NC8ADqMgpy6fpRUuN0MYMgf8iMqFEhq3jZrmCUVyT6Gxb3yIjsH7Yentv6+ygm\r\n" + 
			"kgx4DBECgYEA0qx9ikQgiPNdFIQTZM2JGahlD7Lh6PbMNMRYCw1d18wnPoES1faa\r\n" + 
			"CIbdTsujGKY1R/cn+sSB0C9JMifH8edWORviTkZGnY69C0ArT5pmuxT/0bckwn3b\r\n" + 
			"X3wFeU8PUFunpBlA0fz354ItmxCGPviUsk3R8I4hKEuELpMuyx1bba0CgYEAz2VW\r\n" + 
			"nR4RJ4P1l+Cq8M5LqCUU4O15AtitpE7TEqh/If2tACV038Wu0YV+hG5Fxu2KhmFs\r\n" + 
			"zvd0h8cNlDoZYT84zNofjYAEbxhUzOC6jdOiEXS6/SD2Tq/NVZ12exkGYFmHXiXu\r\n" + 
			"WkMAfDOMN74SmMJ7EpJxc77c5d3M8gs8VQr0MJMCgYAU2LaveOBTTOmX/x3AKsp3\r\n" + 
			"PH+LlyLdn5ZDXm5r4Y24rd3wRGtturIxR88cXfAsnz3EekN9f/ZseFFg4ijZ2g9h\r\n" + 
			"JU42eqPAMYCpXVcr0FZ8Cq7pvJqpmDSd9TLBdz5HsFodVdZhMQwC35HNt0vhbU2h\r\n" + 
			"eyvcBuRnDVnuFehadvQ2HQKBgQCiuzI2ACSXq+wlqqyWXFhy6/2w68R63keJWCw4\r\n" + 
			"RKvUoPaA2eMVvkgIsMVv5hKsHzEFdiZpUzNFYoOeHeRSMMhBvJjrb1qLTT0ksOTQ\r\n" + 
			"ahGNvtkFyzpYzYrBNdeEiUM+kKEt13dprY8Q5WWNS3/OCzOEhBGvL0CmwN2Rwg0p\r\n" + 
			"8XlfLwKBgAxqA32LV3sY6o/NSABGTElsRszRLdNNO49jM26JdQvEkazeIUx116qj\r\n" + 
			"1qdK1Xuyy7esQNlySzXmLUg4wWv2JIi/bqPrPRmrP5Tx6OhEr74REoUnJj3okqxJ\r\n" + 
			"xL42foQIRKgGrg59RlSwMUg/Fq0Xjtx3AbePDqgoVF2FWU14WiWg\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLIC = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqqze15NW9PDv58OHLQJe\r\n" + 
			"s3PM7WoJb48uz+OSMAr1AwSOuDWDfRh59vvjD+xE/Ya4AoLSUnlOxF+5z0VCtP1e\r\n" + 
			"W2gtFOxYHTC6mCOj8NPNiSEWz8wS/wGFUN64iEGfQjy0Fw7+90DC6kaxj1K9UMYd\r\n" + 
			"Vmf8TuNV8BLIPV1h/QpUU1rDp+b4wccNjTnXxjWfVIzq5Gfm/eo4NM0LA9sCf5z2\r\n" + 
			"5/hwH1fCUDRU7LpXYeEfzWCICb0llJb10cyPb+ur/SJMxfeFlq2NP7zWeehTlJ90\r\n" + 
			"+TDf5gyaWdE/mXwXEjaYcZRVow7BXax1f4SuevSNmDr5DUu6L9C13YhNhngBSvRq\r\n" + 
			"VwIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";

}
